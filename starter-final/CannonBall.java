// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class CannonBall extends Actor
{

    /**
     * Act - do whatever the CannonBall wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        gameLost();
        moveBall();
    }

    /**
     * Game is lost method
     */
    public void gameLost()
    {
        Actor ladyBug = getOneIntersectingObject(Ladybug.class);
        if (ladyBug != null) {
            World world = getWorld();
            world.removeObject(ladyBug);
            Greenfoot.playSound("lose.wav");
            transitionToGameOverWorld();
        }
    }

    /**
     * Transition to game over screen
     */
    public void transitionToGameOverWorld()
    {
        World gameOverWorld =  new  GameOverScreen();
        Greenfoot.setWorld(gameOverWorld);
    }

    /**
     * 
     */
    public void moveBall()
    {
        Canon canon =  new  Canon();
        CannonBall ball =  new  CannonBall();
        ball.turn(canon.getRotation());
        move(3);
    }
}
