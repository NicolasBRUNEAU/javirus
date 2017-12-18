import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    // Constructeur monde
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 
    }
    
    // Placement hopital centre de la carte
    public void PosHopitalCenter()
    {
        Hopital H1 = new Hopital();
        addObject(H1, 400, 400);
    }

    public void populate()
    {
        for(int i=0; i<=19 ; i++)
        {
           Human h = new Human(i);
           int posX = Greenfoot.getRandomNumber(800);
           int posY = Greenfoot.getRandomNumber(800);
           addObject(h, posX, posY);
        }
    }
    
    /*public void patient0()
    {
        //ArrayList<Human> humains = new ArrayList<Human>() ;
        List<Human> humains = getObjects(Human.class);
        ListIterator<Human> it = humains.listIterator();
        while(it.hasNext())
        {
            Human human = it.next();
            
        }
    }*/
}
