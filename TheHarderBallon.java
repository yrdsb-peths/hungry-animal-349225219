import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TheHarderBallon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TheHarderBallon extends Actor
{
    /**
     * Act - do whatever the TheHarderBallon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage ballon = new GreenfootImage("ballon.png");
    public TheHarderBallon()
    {
        ballon.scale(50,50);
        setRotation(270);
        setImage(ballon);
    }
    
    int direction = 0;
    
    public void act()
    {
        
        move(-1);
        direction = Greenfoot.getRandomNumber(3) - 1;
        setLocation(getX() - 4*direction, getY());
        MyWorld1 w = (MyWorld1)getWorld();
        if(getY() >= w.getHeight())
        {
            w.gameOver();

        }
    }
}
