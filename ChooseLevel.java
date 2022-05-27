import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the place for the player to choose their pefer diffculity
 * 
 * @author George Lu
 * @version May 2022
 */
public class ChooseLevel extends World
{
    Label choose = new Label("Choose your level of diffculty", 50);
    Label chooseLevel = new Label("press h to choose hard, press e to choose easy", 50);
    
    public ChooseLevel()
    {    
        super(1280, 720, 1); 
        addObject(choose, 640, 360);
        addObject(chooseLevel, 640, 450);
        setBackground(new GreenfootImage("heavenOrHell.jpg"));
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("e"))
        {
            TeachingEasy easy = new TeachingEasy();
            Greenfoot.setWorld(easy);
        }
        
        if(Greenfoot.isKeyDown("h"))
        {
            TeachingHard hard = new TeachingHard();
            Greenfoot.setWorld(hard);
        }
    }
}
