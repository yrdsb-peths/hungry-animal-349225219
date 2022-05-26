import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ChooseLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChooseLevel extends World
{
    Label choose = new Label("Choose your level of diffculty", 50);
    Label chooseLevel = new Label("press e to choose easy, press h to choose hard", 50);
    /**
     * Constructor for objects of class ChooseLevel.
     * 
     */
    public ChooseLevel()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
        addObject(choose, 640, 360);
        addObject(chooseLevel, 640, 450);
    }
}
