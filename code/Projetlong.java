
public class Projetlong extends Virus 
{
    public static int zone_contagion = 100;
    public static int letalite = 2;
    public static int risque_transmission = 30;
    public static String name = "Projetlong";
    protected Human hum;
    
    // Constructeur de Projetlong
    public Projetlong(Human h)
    {
        // id, statutsocial, classe Human, nom virus, letalite, risque contagion, zone contagion
        super(h);
        hum = h;
        this.chemin_image = "images/ppl3.png";
    }
    
    public boolean isInfected(Class<? extends Virus> vr){
        // recherche déja infecte par un virus (vr)
        return(this.getClass() == vr || hum.isInfected(vr));       
    }
}
