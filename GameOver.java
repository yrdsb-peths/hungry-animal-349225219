import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The game over page of the game
 * 
 * @author George Lu
 * @version May 2022
 */
public class GameOver extends World
{
    Label endGame = new Label("too bad, you didn't make it:(", 60);
    
    public GameOver()
    {    
        super(800, 533, 1);
        addObject(endGame, 400, 100);
        setBackground(new GreenfootImage("gameOver.jpg"));
    }
}
