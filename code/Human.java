import greenfoot.*; 
import java.util.List;

public abstract class Human extends Actor  
{
    // instance variables
    private int id;
    private static int nb = 0;
    private boolean vie;
    private int statutSocial;
    public String chemin_image = "images/bee.png";
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
        if ( Greenfoot.getRandomNumber(21) > 19 ){
            turn(Greenfoot.getRandomNumber(180));
        }
        move(1);
        this.contracte();
        // this.setImage(this.chemin_image);
    }
    
    public void contracte()
    {
        int choix_maladie = Greenfoot.getRandomNumber(3);
        int effet_vaccin = 0;
        int posX = this.getX();
        int posY = this.getY();
        int nbr_voisin = 0;

        switch(choix_maladie){
            case 0:
                if(! this.isInfected(Meetu.class)){
                    nbr_voisin = this.nbr_voisin(Meetu.class, Meetu.zone_contagion);
                    for(int i = 0; i < nbr_voisin; i++){
                        // Test possetion vaccin
                        if (this.isImmunised(Anti_Meetu.class)){
                            effet_vaccin = Anti_Meetu.proba_resistance;
                        }
                        // Test proba de transmission : proba transmission + proba reussite vaccin
                        if(Greenfoot.getRandomNumber(100) >= Meetu.risque_transmission){
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
                        // Test possetion vaccin
                        if (this.isImmunised(Anti_Anr.class)){
                            effet_vaccin = Anti_Anr.proba_resistance;
                        }
                        // Test proba de transmission : proba transmission + proba reussite vaccin
                        if(Greenfoot.getRandomNumber(100) >= effet_vaccin){
                            if(Greenfoot.getRandomNumber(100) >= Anr.risque_transmission){
                                Anr new_malade = new Anr(this);
                                getWorld().addObject(new_malade, posX, posY);
                                getWorld().removeObject(this);
                                break;
                            }
                        }
                    }
                }
                break;
            case 2:
                if(! this.isInfected(Projetlong.class)){
                    nbr_voisin = this.nbr_voisin(Projetlong.class, Projetlong.zone_contagion);
                    for(int i = 0; i < nbr_voisin; i++){
                        // Test possetion vaccin
                        if (this.isImmunised(Anti_Projetlong.class)){
                            effet_vaccin = Anti_Projetlong.proba_resistance;
                        }
                        // Test proba de transmission : proba transmission + proba reussite vaccin
                        if(Greenfoot.getRandomNumber(100) >= Projetlong.risque_transmission){
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

    
