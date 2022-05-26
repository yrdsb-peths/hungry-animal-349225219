import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TheHarderArrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TheHarderArrow extends Actor
{
    /**
     * Act - do whatever the TheHarderArrow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    MyWorld world = (MyWorld) getWorld();
    GreenfootSound ballonBlow = new GreenfootSound("ballonBlowSound.wav");
    
    public TheHarderArrow()
    {
        setRotation(270);
        setImage("arrow.png");
    }
    
    public void hit()
    {
        if(isTouching(TheHarderBallon.class))
        {
            removeTouching(TheHarderBallon.class);
            ballonBlow.play();
            MyWorld1 w = (MyWorld1)getWorld();
            w.createBallon();
            w.increaseScore();
        }
    }
    
    public void act()
    {
        move(3);
        hit();
    }
}
