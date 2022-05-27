import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The arrow class for the easier version, create a arrow.
 * 
 * @author George Lu
 * @version May 2022
 */
public class TheArrow extends Actor
{
    GreenfootSound ballonBlow = new GreenfootSound("ballonBlowSound.wav");
    
    public TheArrow()
    {
        setRotation(270);
    }
    
    public void hit()
    {
        if(isTouching(Ballon.class))
        {
            removeTouching(Ballon.class);
            ballonBlow.play();
            MyWorld w = (MyWorld)getWorld();
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
