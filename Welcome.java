import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**This world is the start up page for the player·
 * 
 * @author George Lu 
 * @version May 2022
 */
public class Welcome extends World
{
    Label title = new Label("Welcome to the Monkey Shooter!", 40);
    Label tips = new Label("To start, press your space bar!", 40);
    
    public Welcome()
    {    
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
