import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Welcome here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Welcome extends World
{
    Label title = new Label("Welcome to the Monkey Shooter!", 50);

    /**
     * Constructor for objects of class Welcome.
     * 
     */
    public Welcome()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
        addObject(title,640,360);
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            ChooseLevel newWorld = new ChooseLevel();
            Greenfoot.setWorld(newWorld);
        }
    }
}
