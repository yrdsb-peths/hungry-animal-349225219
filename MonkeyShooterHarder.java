import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class is the for the harder version of the game, create a monkey.
 * 
 * @author George Lu
 * @version May 2022
 */
public class MonkeyShooterHarder extends Actor
{
    private GreenfootImage[] faceRight = new GreenfootImage[9];
    private GreenfootImage[] faceLeft = new GreenfootImage[9];
    private boolean faceLeftOrNot = true;
    private int stepCheck = 0;
    private SimpleTimer timer = new SimpleTimer();
    
    public MonkeyShooterHarder()
    {
        for(int i = 0; i < faceRight.length; i++){
            faceRight[i] = new GreenfootImage("actor" + i + ".png");
            faceRight[i].mirrorHorizontally();
            
            faceLeft[i] = new GreenfootImage("actor" + i + ".png");
            setImage(faceLeft[0]);
            
            timer.mark();
    
        }
    }
    
    public void move()
    {
        MyWorld1 w = (MyWorld1)getWorld();
        
        if(Greenfoot.isKeyDown("a"))
        {
            move(-4);
            w.positionXMonkeyH -= 4;
            faceLeftOrNot = true;
        }
        
        if(Greenfoot.isKeyDown("d"))
        {
            move(4);
            w.positionXMonkeyH += 4;
            faceLeftOrNot = false;
        }
        
        if(Greenfoot.isKeyDown("w"))
        {
            if(getY() >= 300)
            {
                setLocation(getX(), getY() - 4);
                w.positionYMonkeyH -= 4;
            }
        }
        
        if(Greenfoot.isKeyDown("s"))
        {
            if(getY() <= 400)
            {
                setLocation(getX(), getY() + 4);
                w.positionYMonkeyH += 4;
            }
        }
        
    }
    
    public void act()
    {
        move();
        
        if(timer.millisElapsed() < 100)
        {
            return;
        }
        
        if(faceLeftOrNot == true && Greenfoot.isKeyDown("a"))
        {
            setImage(faceLeft[stepCheck]);
            stepCheck++;
            stepCheck %= 3;
        }
        else if(faceLeftOrNot == false && Greenfoot.isKeyDown("d"))
        {
            setImage(faceRight[stepCheck]);
            stepCheck++;
            stepCheck %= 3;
        }
        
        timer.mark();
    }
}
