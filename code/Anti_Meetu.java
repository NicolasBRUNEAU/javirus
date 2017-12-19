
public class Anti_Meetu extends Vaccin 
{
    // Constructeur 
    public Anti_Meetu(Human h)
    {
        super(h.getID(), h.getStatut(), h, "Anti_Meetu", 2, 1000, 50);
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