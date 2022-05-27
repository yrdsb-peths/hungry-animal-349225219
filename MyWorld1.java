import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The world for harder version of the game
 * 
 * @author George Lu
 * @version May 2022
 */

public class MyWorld1 extends World
{
    public int positionXMonkeyH;
    public int positionYMonkeyH;
    private SimpleTimer timer = new SimpleTimer();
    public int score = 0;
    private Label theScore;
    
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
        createRock();
        
    }
    
    public void gameOver()
    {
        GameOver world = new GameOver();
        Greenfoot.setWorld(world);
    }
    
    public void createRock()
    {
        FallingRock rock = new FallingRock();
        int x = Greenfoot.getRandomNumber(700) + 50;
        int y = 0;
        addObject(rock, x, y);
    }
    
    public void increaseScore()
    {
        score++;
        theScore.setValue(score);
    }
    
    public void createBallon()
    {
        TheHarderBallon ballon = new TheHarderBallon();
        int x = Greenfoot.getRandomNumber(700) + 50;
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
    
    public void act()
    {
        beingShot();
    }
    
}
