import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FallingRock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FallingRock extends Actor
{
    /**
     * Act - do whatever the FallingRock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
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
