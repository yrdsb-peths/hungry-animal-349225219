import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The arrow class for the harder version of the game, create a arrow.
 * 
 * @author George Lu
 * @version May 2022
 */
public class TheHarderArrow extends Actor
{
    GreenfootSound ballonBlow = new GreenfootSound("ballonBlowSound.wav");
    GreenfootImage harderArrow = new GreenfootImage("arrow.png");
    
    public TheHarderArrow()
    {
        setRotation(270);
        setImage(harderArrow);
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
