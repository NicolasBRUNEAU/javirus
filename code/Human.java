import greenfoot.*; 
import java.util.List;
/**
 * Write a description of class Human here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Human extends Actor  
{
    // instance variables
    private int id;
    private boolean vie;
    private int statutSocial;
    protected String chemin_image;
    
    // Constructeur Human
    protected Human(int id, int statut)
    {
       this.id = id;
       this.statutSocial = statut;
       this.vie = true;
    }
    
    
    public int getID(){
        return this.id;
    }
    
    public int getStatut(){
        return this.statutSocial;
    }
    
    public boolean knowVirus(Virus vr){
        // retourner les virus
        return true;
    }
     
    public boolean knowVaccin(Vaccin vc){
        // retourner les vaccins
        return false;
    }
   
    public void act()
    {
        turn(Greenfoot.getRandomNumber(360));
        move(10);
        this.contracte();
        this.setImage(this.chemin_image);
    }
    
    public void contracte()
    {
        List <Meetu> voisins = this.getObjectsInRange(Meetu.zone_contagion, Meetu.class);
        int nb_contaminant = voisins.size();
        for(int i = 0; i < nb_contaminant; i++)
        {
            int n = Greenfoot.getRandomNumber(100);
            if(n >= Meetu.risque_transmission)
            {
                Meetu new_malade = new Meetu(this);
                getWorld().addObject(new_malade, this.getX(), this.getY());
                getWorld().removeObject(this);
            }
        }
        
    }
    
    
}
    
