import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class is for the easier version of the game, create the monkey
 * 
 * @author George Lu
 * @version May 2022
 * 
 */
public class MonkeyShooter extends Actor
{
    private GreenfootImage[] faceRight = new GreenfootImage[9];
    private GreenfootImage[] faceLeft = new GreenfootImage[9];
    private boolean faceLeftOrNot = true;
    private int stepCheck = 0;
    private SimpleTimer timer = new SimpleTimer();
    
    public MonkeyShooter()
    {
        for(int i = 0; i < faceRight.length; i++){
            faceRight[i] = new GreenfootImage("actor" + i + ".png");
            faceRight[i].mirrorHorizontally();
            
            faceLeft[i] =new GreenfootImage("actor" + i + ".png");
            setImage(faceLeft[0]);
            
            timer.mark();
        }
    }
    
    public void move()
    {
        MyWorld w = (MyWorld)getWorld();
        
        if(Greenfoot.isKeyDown("a"))
        {
            move(-4);
            w.positionXMonkey -= 4;
            faceLeftOrNot = true;
        }
        
        if(Greenfoot.isKeyDown("d"))
        {
            move(4);
            w.positionXMonkey += 4;
            faceLeftOrNot = false;
            
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
