
public class Anti_Projetlong extends Vaccin 
{
    // Constructeur Vaccin projetlong
    public Anti_Projetlong(Human h)
    {
        super(h.getID(), h.getStatut(), h, "Anti_Projetlong", 3, 1000, 60);
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