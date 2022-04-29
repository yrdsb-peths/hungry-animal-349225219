import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class elephant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class elephant extends Actor
{
    String name;
    public animal(String name1)
    {
        name = name1;
    }
    
    
    public void act()
    {
        // Add your action code here.
        move(-1);
        
    }
}
