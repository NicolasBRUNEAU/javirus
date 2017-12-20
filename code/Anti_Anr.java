
public class Anti_Anr extends Vaccin 
{
    // Instance Variable
    protected Human hum;
    public static String name = "Anti_Anr";
    public static int statutLimite = 2;
    public static int duree_efficacite = 1000;
    public static int proba_resistance = 70;
    
    // Constructeur Vaccin Anr
    public Anti_Anr(Human h)
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
