import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TheArrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TheArrow extends Actor
{
    /**
     * Act - do whatever the TheArrow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public TheArrow()
    {
        setRotation(270);
    }
    
    
    public void act()
    {
        move(3);
    }
}
