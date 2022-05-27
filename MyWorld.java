import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the world for the easier version of the game
 * 
 * @author George Lu
 * @version May 2022
 */
public class MyWorld extends World
{
    public int positionXMonkey;
    public int positionYMonkey;
    private SimpleTimer timer = new SimpleTimer();
    public int score = 0;
    private Label theScore;
    private int level = -1;
    
    public MyWorld()
    {    
        super(852, 480, 1,false); 
        setBackground(new GreenfootImage("background.png"));
        positionXMonkey = 400;
        positionYMonkey = 400;
        
        theScore = new Label(0,50);
        addObject(theScore, 20, 20);
        
        timer.mark();
    
        MonkeyShooter monkey = new MonkeyShooter();
        addObject(monkey, positionXMonkey, positionYMonkey);
        
        createBallon();
        
    }
    
    public void gameOver()
    {
        GameOver world = new GameOver();
        Greenfoot.setWorld(world);
    }
    
    public void increaseScore()
    {
        score++;
        theScore.setValue(score);
        if(score % 5 == 0)
        {
            level--;
        }
    }
    
    public void createBallon()
    {
        Ballon ballon = new Ballon();
        ballon.increaseSpeed(level);
        int x = Greenfoot.getRandomNumber(852);
        int y = 0;
        addObject(ballon, x, y);
    }
    
    public void beingShot()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            if(timer.millisElapsed() > 500)
            {
                TheArrow arrow = new TheArrow();
                addObject(arrow, positionXMonkey, positionYMonkey);
                timer.mark();
            }
            
        }
    }
    
    public void act()
    {
        beingShot();
    }
}
