import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Welcome here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Welcome extends World
{
    Label title = new Label("Welcome to the Monkey Shooter!", 40);
    Label tips = new Label("To start, press your space bar!", 40);
    /**
     * Constructor for objects of class Welcome.
     * 
     */
    public Welcome()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(853, 480, 1); 
        addObject(title,425,240);
        addObject(tips,425,330);
        setBackground(new GreenfootImage("openingPage.png"));
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
