import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

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
        Human h;
        for(int i = 0; i < 6; i++){
            addObject(new P7(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(800));
            addObject(new P6(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(800));
            addObject(new P11(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(800));
        }
        addObject(new Anr(new P7()), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(800));
        addObject(new Meetu(new P6()), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(800));
        addObject(new Projetlong(new P11()), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(800));
    }
    
    public void immunize(){
        // immunisation de population
        /*
         * prototype comme la graine 0 de la maladie
         * 
         * Human c = new Anti_XXXX(c);
         */
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
