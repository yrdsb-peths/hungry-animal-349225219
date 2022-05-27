import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The ballon class for the harder version of the game, cretae a ballon.
 * 
 * @author George Lu
 * @version May 2022
 */
public class TheHarderBallon extends Actor
{
    GreenfootImage ballon = new GreenfootImage("ballon.png");
    int direction = 0;
    
    public TheHarderBallon()
    {
        ballon.scale(50,50);
        setRotation(270);
        setImage(ballon);
    }
    
    public void act()
    {
        move(-1);
        direction = Greenfoot.getRandomNumber(3) - 1;
        setLocation(getX() - 5*direction, getY());
        
        MyWorld1 w = (MyWorld1)getWorld();
        
        if(getY() >= w.getHeight())
        {
            w.gameOver();
        }
    }
}
