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

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(852, 480, 1); 
        setBackground(new GreenfootImage("background.png"));
        positionXMonkey = 400;
        positionYMonkey = 400;
    
        MonkeyShooter monkey = new MonkeyShooter();
        addObject(monkey, positionXMonkey, positionYMonkey);
        
    }
    
    
    public void act()
    {
        beingShot();
        
    }
    
    public void beingShot()
        {
            if(Greenfoot.isKeyDown("space"))
            {
                TheArrow arrow = new TheArrow();
                addObject(arrow, positionXMonkey, positionYMonkey);
            }
        }
}
