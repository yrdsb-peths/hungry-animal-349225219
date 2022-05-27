import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TeachingHard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TeachingHard extends World
{
    Label rule = new Label("press space to shoot the arrow, destroy the ballon", 30);
    Label rule1 = new Label("If you let the ballon drop to the ground or tounch the rock, you fail!", 30);
    Label rule2 = new Label("press a to move left, press d to move right", 30);
    Label rule3 = new Label("press w to move up, press s to move down", 30);
    Label rule4 = new Label("otherwise, have fun!", 30);
    Label rule5 = new Label("press space to start!", 30);
        
    /**
     * Constructor for objects of class TeachingHard.
     * 
     */
    public TeachingHard()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(852, 480, 1); 
        addObject(rule,426,100);
        addObject(rule1,426,150);
        addObject(rule2,426,200);
        addObject(rule3,426,250);
        addObject(rule4,426,300);
        addObject(rule5,426,350);
        setBackground(new GreenfootImage("background.png"));
        
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld1 hard = new MyWorld1();
            Greenfoot.setWorld(hard);
        }
    }
}
