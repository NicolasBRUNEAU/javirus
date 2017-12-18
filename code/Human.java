import greenfoot.*; 
import java.util.ArrayList;
/**
 * Write a description of class Human here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Human extends Actor  
{
    // instance variables
    private int id;
    private boolean vie;
    private ArrayList<String> maladies = new ArrayList<String>() ;
    private ArrayList<String> vaccins= new ArrayList<String>() ;
    private int statutSocial;
    
    

    /**
     * Constructor for objects of class Human
     */
    public Human(int id)
    {
       this.id = id;
       this.vie = true;
       this.statutSocial = Greenfoot.getRandomNumber(3);
       
    }

   
    public void act()
    {
        turn(Greenfoot.getRandomNumber(360));
        move(10);
    }
    
    public int randomMove()
    {
        return 0;
    }
    
    
}
    
