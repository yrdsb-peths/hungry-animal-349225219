import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public int positionXMonkey;
    public int positionYMonkey;
    private SimpleTimer timer = new SimpleTimer();
    public int score = 0;
    Label theScore;
    

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(852, 480, 1,false); 
        setBackground(new GreenfootImage("background.png"));
        positionXMonkey = 400;
        positionYMonkey = 400;
        theScore = new Label(0,50);
        addObject(theScore, 20, 20);
        
        timer.mark();
    
        MonkeyShooter monkey = new MonkeyShooter();
        addObject(monkey, positionXMonkey, positionYMonkey);
        createBallon();
        
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
        Ballon ballon = new Ballon();
        int x = Greenfoot.getRandomNumber(852);
        int y = 0;
        addObject(ballon, x, y);
    }
    
    public void beingShot()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            if(timer.millisElapsed() > 500)
            {
                TheArrow arrow = new TheArrow();
                addObject(arrow, positionXMonkey, positionYMonkey);
                timer.mark();
            }
            
        }
    }
}
