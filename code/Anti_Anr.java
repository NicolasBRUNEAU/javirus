/**
 * Write a description of class Anti_Anr here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Anti_Anr extends Vaccin 
{
    // Constructeur Vaccin Anr
    public Anti_Anr(Human h)
    {
        super(h.getID(), h.getStatut(), h, "Anti_Anr", 2, 1000, 70);
    }
    
    // getter
    public int getLimite(){
        return this.statutLimite;
    }
    public int getDuree(){
        return this.duree_efficacite;
    }
    public int getResistance(){
        return this.proba_resistance;
    }
}
