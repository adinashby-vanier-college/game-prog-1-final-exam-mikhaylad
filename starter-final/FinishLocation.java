// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class FinishLocation extends Actor
{

    /**
     * Act - do whatever the FinishLocation wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        gameIsWon();
    }

    /**
     * Method for won game
     */
    public void gameIsWon()
    {
        Actor ladyBug = getOneIntersectingObject(Ladybug.class);
        if (ladyBug != null) {
            World world = getWorld();
            world.removeObject(ladyBug);
            transitionToGameWonWorld();
        }
    }

    /**
     * Method to transition to winning screen
     */
    public void transitionToGameWonWorld()
    {
        World gameWonWorld =  new  WinningScreen();
        Greenfoot.setWorld(gameWonWorld);
    }
}
