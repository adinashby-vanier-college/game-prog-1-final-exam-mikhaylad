// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class WinningScreen extends World
{

    /**
     * Constructor for objects of class WinningScreen.
     */
    public WinningScreen()
    {
        super(600, 400, 1);
        showText("Congratulations, You Win!", 50, 200);
    }

    /**
     * Show text
     */
    public void showText(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(45);
        bg.setFont(font);
        bg.setColor(Color.WHITE);
        bg.drawString(message, x, y);
    }

    /**
     * Play win sound
     */
    public void winSound()
    {
        Greenfoot.playSound("win.wav");
    }
}
