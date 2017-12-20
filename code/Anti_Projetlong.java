
public class Anti_Projetlong extends Vaccin 
{
    // Instance Variable
    protected Human hum;
    public static String name = "Anti_Projetlong";
    public static int statutLimite = 3;
    public static int duree_efficacite = 1000;
    public static int proba_resistance = 60;
        
    // Constructeur Vaccin projetlong
    public Anti_Projetlong(Human h)
    {
        super(h);
        hum = h;
        this.setImage(h.getImage());
    }

    public boolean isImmunised(Class<? extends Vaccin> vc){
        // recherche déja immunise par vaccin (vc)
        return(this.getClass() == vc || hum.isImmunised(vc));
    }
}