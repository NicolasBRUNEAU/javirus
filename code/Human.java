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
    static int compteur_act = 0;
    
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
        int choix_maladie = Greenfoot.getRandomNumber(3);
        int n = Greenfoot.getRandomNumber(100);
        int posX = this.getX();
        int posY = this.getY();
        int nbr_voisin = 0;

        switch(choix_maladie){
            case 0:
                nbr_voisin = this.nbr_voisin(Meetu.class, Meetu.zone_contagion);
                for(int i = 0; i < nbr_voisin; i++){
                    if(n >= Meetu.risque_transmission){
                        Meetu new_malade = new Meetu(this);
                        getWorld().addObject(new_malade, posX, posY);
                        getWorld().removeObject(this);
                        break;
                    }
                }
                break;
            case 1:
                nbr_voisin = this.nbr_voisin(Anr.class, Anr.zone_contagion);
                for(int i = 0; i < nbr_voisin; i++){
                    if(n >= Anr.risque_transmission){
                        Anr new_malade = new Anr(this);
                        getWorld().addObject(new_malade, posX, posY);
                        getWorld().removeObject(this);
                        break;
                    }
                }
                break;
            case 2:
                nbr_voisin = this.nbr_voisin(Projetlong.class, Projetlong.zone_contagion);
                for(int i = 0; i < nbr_voisin; i++){
                    if(n >= Projetlong.risque_transmission){
                        Projetlong new_malade = new Projetlong(this);
                        getWorld().addObject(new_malade, posX, posY);
                        getWorld().removeObject(this);
                        break;
                    }
                }
                break;
        }
        /*
        switch(choix_maladie){
            case 0:
                this.tomber_malade(Meetu.class, Meetu.zone_contagion, Meetu.risque_transmission);
                break;
            case 1:
                this.tomber_malade(Anr.class, Anr.zone_contagion, Anr.risque_transmission);
                break;
            case 2:
                this.tomber_malade(Projetlong.class, Projetlong.zone_contagion, Projetlong.risque_transmission);
                break;
        }
        */
    }
    
    public int nbr_voisin(Class<? extends Virus> c, int zc){        
        if ( ! (this.getClass() == c ) )
        {
            List voisins = this.getObjectsInRange(zc, c);
            return voisins.size();
        }
        else{
            return 0;
        }
    }
    
    /*
    public void tomber_malade(Class<? extends Virus> c, int zc, int rt){
        int posX = this.getX();
        int posY = this.getY();
        
        if ( ! (this.getClass()==c ) )
        {
            List voisins = this.getObjectsInRange(zc, c);
            int nb_contaminant = voisins.size();
            for(int i = 0; i < nb_contaminant; i++)
            {
                int n = Greenfoot.getRandomNumber(100);
                if(n >= rt)
                {
                    try {
                         Object new_malade = c.newInstance();
                         ((Virus)new_malade).addHuman(this);
                         getWorld().addObject((Actor)new_malade, posX, posY);
                         getWorld().removeObject(this);
                    } catch( InstantiationException ie ){
                         throw new RuntimeException( ie );
                    } catch( IllegalAccessException ie ){
                         throw new RuntimeException( ie );
                    }
                   
                    break;
                }
            }
        }
    }
    */

}

    
