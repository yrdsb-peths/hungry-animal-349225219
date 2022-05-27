import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The ballon class for the easier version of the game
 * 
 * @author George Lu
 * @version May 2022
 */
public class Ballon extends Actor
{
    /**
     * This actor will be ballon that need to be destory.
     * Destory one ballon will earn one mark.
     */
    
    GreenfootImage ballon = new GreenfootImage("ballon.png");
    int speed = -1;
    
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
