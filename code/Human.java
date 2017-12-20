import greenfoot.*; 
import java.util.List;

public abstract class Human extends Actor  
{
    // instance variables
    private int id;
    private static int nb = 0;
    private boolean vie;
    private int statutSocial;
    protected String chemin_image;
    static int compteur_act = 0;
    
    // Constructeur Human
    protected Human(int statut)
    {
       this.id = nb++;
       this.statutSocial = statut;
       this.vie = true;
    }
    
    
    public int getID(){
        return this.id;
    }
    
    public int getStatut(){
        return this.statutSocial;
    }

    public void act()
    {
        if ( Greenfoot.getRandomNumber(3) > 1){
            turn(Greenfoot.getRandomNumber(180));
        }
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
                if(! this.isInfected(Meetu.class)){
                    nbr_voisin = this.nbr_voisin(Meetu.class, Meetu.zone_contagion);
                    for(int i = 0; i < nbr_voisin; i++){
                        if(n >= Meetu.risque_transmission){
                            Meetu new_malade = new Meetu(this);
                            getWorld().addObject(new_malade, posX, posY);
                            getWorld().removeObject(this);
                            break;
                        }
                    }
                }
                break;
            case 1:
                if(! this.isInfected(Anr.class)){
                    nbr_voisin = this.nbr_voisin(Anr.class, Anr.zone_contagion);
                    for(int i = 0; i < nbr_voisin; i++){
                        if(n >= Anr.risque_transmission){
                            Anr new_malade = new Anr(this);
                            getWorld().addObject(new_malade, posX, posY);
                            getWorld().removeObject(this);
                            break;
                        }
                    }
                }
                break;
            case 2:
                if(! this.isInfected(Projetlong.class)){
                    nbr_voisin = this.nbr_voisin(Projetlong.class, Projetlong.zone_contagion);
                    for(int i = 0; i < nbr_voisin; i++){
                        if(n >= Projetlong.risque_transmission){
                            Projetlong new_malade = new Projetlong(this);
                            getWorld().addObject(new_malade, posX, posY);
                            getWorld().removeObject(this);
                            break;
                        }
                    }
                }
                break;
        }
    }
       
    public boolean isImmunised(Class<? extends Vaccin> vc){
        // recherche déja immunise par un vaccin (vc)
        return(this.getClass() == vc);
    }
   
    public boolean isInfected(Class<? extends Virus> vr){
        // recherche déja infecte par un virus (vr)
        return(this.getClass() == vr);
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
}

    
