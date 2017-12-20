
public class Meetu extends Virus 
{    
    public static int zone_contagion = 30;
    public static int letalite = 2;
    public static int risque_transmission = 5;
    public static String name = "Meetu";
    protected Human hum;
    
    public Meetu(Human h)
    {
        // id, statutsocial, classe Human, nom virus, letalite, risque contagion, zone contagion
        super(h);
        hum = h;
        this.chemin_image = "images/ppl1.png";
        this.setImage("images/ppl1.png");
    }
    
    public boolean isInfected(Class<? extends Virus> vr){
        // recherche déja infecte par un virus (vr)
        return(this.getClass() == vr || hum.isInfected(vr));       
    }
}
