
public class Anr extends Virus 
{
    public static int zone_contagion = 120;
    public static int letalite = 10;
    public static int risque_transmission = 50;
    
    // Constructeur de Canardite
    public Anr(Human h)
    {
        // id, statutsocial, classe Human, nom virus, letalite, risque contagion, zone contagion
        super(h.getID(), h.getStatut(), h, "Anr");
        this.chemin_image = "images/ppl2.png";
    }
}
