import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TeachingEasy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TeachingEasy extends World
{
    Label rule = new Label("press space to shoot the arrow, destroy the ballon", 30);
    Label rule1 = new Label("If you let the ballon drop to the ground, you failed!", 30);
    Label rule2 = new Label("press a to move left, press d to move right", 30);
    Label rule3 = new Label("otherwise, have fun!", 30);
    Label rule4 = new Label("press space to start!", 30);
    
    /**
     * Constructor for objects of class TeachingEasy.
     * 
     */
    public TeachingEasy()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(rule,300,100);
        addObject(rule1,300,150);
        addObject(rule2,300,200);
        addObject(rule3,300,250);
        addObject(rule4,300,300);
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld easy = new MyWorld();
            Greenfoot.setWorld(easy);
        }
    }
}
