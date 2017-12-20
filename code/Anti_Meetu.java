
public class Anti_Meetu extends Vaccin 
{
    // Instance Variable
    protected Human hum;
    public static String name = "Anti_Meetu";
    public static int statutLimite = 2;
    public static int duree_efficacite = 1000;
    public static int proba_resistance = 50;
    
    // Constructeur 
    public Anti_Meetu(Human h)
    {
        super(h);
    }
    
    public boolean isImmunised(Class<? extends Vaccin> vc){
        // recherche déja immunise par vaccin (vc)
        return(this.getClass() == vc || hum.isImmunised(vc));
    }
}