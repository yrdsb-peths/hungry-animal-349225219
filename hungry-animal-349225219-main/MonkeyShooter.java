import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MonkeyShooter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MonkeyShooter extends Actor
{
    /**
     * Act - do whatever the MonkeyShooter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void move()
    {
        MyWorld w = (MyWorld)getWorld();
        if(Greenfoot.isKeyDown("a"))
        {
            move(-2);
            w.positionXMonkey -= 2;
        }
        if(Greenfoot.isKeyDown("d"))
        {
            move(2);
            w.positionXMonkey += 2;
        }
    }
    
    public void act()
    {
        move();
    }
}
