import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class powerups here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class powerups extends Actor
{
    public powerups() {
        // Set the image of your power-up
        setImage("powerup.png");
    }

    public void act() {
        // Add behavior when the power-up is picked up by the player
        if (isTouching(Bird.class)) {
            // Apply power-up effects here
           

            // Remove the power-up from the world
            getWorld().removeObject(this);
        }
    }
    
}


