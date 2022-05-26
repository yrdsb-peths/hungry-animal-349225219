import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ballon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ballon extends Actor
{
    /**
     * Act - do whatever the Ballon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage ballon = new GreenfootImage("ballon.png");
    int speed = 0-1;
    
    public Ballon()
    {
        ballon.scale(50,50);
        setRotation(270);
        setImage(ballon);
    }
    
    public void increaseSpeed(int speed1)
    {
        speed = speed1;
    }
    
    public void act()
    {
        
        MyWorld w = (MyWorld)getWorld();
        
        move(speed);
        
        if(getY() >= w.getHeight())
        {
            w.gameOver();

        }
    }
}
