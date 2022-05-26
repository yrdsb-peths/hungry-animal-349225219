import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MonkeyShooterHarder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MonkeyShooterHarder extends Actor
{
    /**
     * Act - do whatever the MonkeyShooterHarder wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage[] faceRight = new GreenfootImage[9];
    private GreenfootImage[] faceLeft = new GreenfootImage[9];
    boolean faceLeftOrNot = true;
    int stepCheck = 0;
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
