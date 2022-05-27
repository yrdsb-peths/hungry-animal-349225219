import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the falling rock class, it is for the harder version of the game.
 * 
 * @author George Lu
 * @version May 2022
 */
public class FallingRock extends Actor
{
    
    public FallingRock()
    {
        setImage("rock.png");
    }
    
    public void fall()
    {
        setLocation(getX(), getY() + 1);
    }
    
    public void act()
    {
        fall();
        
        MyWorld1 w = (MyWorld1)getWorld();
        if(isTouching(MonkeyShooterHarder.class))
        {
            w.gameOver();
        }
        if(getY() == 480)
        { 
            w.createRock();
        }
    }
}
