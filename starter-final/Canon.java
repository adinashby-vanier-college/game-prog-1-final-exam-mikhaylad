// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Canon extends Actor
{

    /**
     * Act - do whatever the Canon wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        shoot();
    }

    /**
     * Method to shoot canonballs
     */
    public void shoot()
    {
        Canon canon =  new  Canon();
        CannonBall ball =  new  CannonBall();
        getWorld().addObject(ball, getX(), getY());
    }
}
