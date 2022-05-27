import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The game rule of easier version
 * 
 * @author George Lu
 * @version May 2022
 */
public class TeachingEasy extends World
{
    Label rule = new Label("press space to shoot the arrow, destroy the ballon", 30);
    Label rule1 = new Label("If you let the ballon drop to the ground, you failed!", 30);
    Label rule2 = new Label("press a to move left, press d to move right", 30);
    Label rule3 = new Label("otherwise, have fun!", 30);
    Label rule4 = new Label("press space to start!", 30);
    
    public TeachingEasy()
    {    
        super(852, 480, 1);
        addObject(rule,426,100);
        addObject(rule1,426,150);
        addObject(rule2,426,200);
        addObject(rule3,426,250);
        addObject(rule4,426,300);
        setBackground(new GreenfootImage("background.png"));
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
