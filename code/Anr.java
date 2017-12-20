
public class Anr extends Virus 
{
    public static int zone_contagion = 50;
    public static int letalite = 10;
    public static int risque_transmission = 2;
    public static String name = "Anr";
    protected Human hum;
    
    // Constructeur de Canardite
    public Anr(Human h)
    {
        // id, statutsocial, classe Human, nom virus, letalite, risque contagion, zone contagion
        super(h);
        hum = h;
        this.chemin_image = "images/ppl2.png";
        this.setImage("images/ppl2.png");
    }
    
    public boolean isInfected(Class<? extends Virus> vr){
        // recherche déja infecte par un virus (vr)
        return(this.getClass() == vr || hum.isInfected(vr));       
    }
}
