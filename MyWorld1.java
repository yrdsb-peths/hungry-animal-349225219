import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld1 extends World
{

    /**
     * Constructor for objects of class MyWorld1.
     * 
     */
    public int positionXMonkeyH;
    public int positionYMonkeyH;
    private SimpleTimer timer = new SimpleTimer();
    public int score = 0;
    Label theScore;
    
    public MyWorld1()
    {
        super(852, 480, 1,false); 
        setBackground(new GreenfootImage("background.png"));
        positionXMonkeyH = 400;
        positionYMonkeyH = 400;
        theScore = new Label(0,50);
        addObject(theScore, 20, 20);
        
        timer.mark();
    
        MonkeyShooterHarder monkey = new MonkeyShooterHarder();
        addObject(monkey, positionXMonkeyH, positionYMonkeyH);
        createBallon();
        
    }
    
    public void gameOver()
    {
        GameOver world = new GameOver();
        Greenfoot.setWorld(world);
    }
    
    public void increaseScore()
    {
        score++;
        theScore.setValue(score);
    }
    
    public void act()
    {
        beingShot();
        
    }
    
    public void createBallon()
    {
        TheHarderBallon ballon = new TheHarderBallon();
        int x = Greenfoot.getRandomNumber(800);
        int y = 0;
        addObject(ballon, x, y);
    }
    
    public void beingShot()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            if(timer.millisElapsed() > 500)
            {
                TheHarderArrow arrow = new TheHarderArrow();
                addObject(arrow, positionXMonkeyH, positionYMonkeyH);
                timer.mark();
            }
            
        }
    }
    
    
}
