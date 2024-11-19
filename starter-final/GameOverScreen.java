// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class GameOverScreen extends World
{

    /**
     * Constructor for objects of class GameOverScreen.
     */
    public GameOverScreen()
    {
        super(600, 400, 1);
        showText("Game Over!", 150, 200);
    }

    /**
     * Show text
     */
    public void showText(String message, int x, int y)
    {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(50);
        bg.setFont(font);
        bg.setColor(Color.WHITE);
        bg.drawString(message, x, y);
    }

    /**
     * Play losing sound
     */
    public void loseSound()
    {
        Greenfoot.playSound("lose.wav");
    }
}
