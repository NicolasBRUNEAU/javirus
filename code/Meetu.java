
public class Meetu extends Virus 
{    
    public static int zone_contagion = 150;
    public static int letalite = 2;
    public static int risque_transmission = 50;
    public static String name = "Meetu";
   
    public Meetu(Human h)
    {
        // id, statutsocial, classe Human, nom virus, letalite, risque contagion, zone contagion
        super(h.getID(), h.getStatut(), h);
        this.chemin_image = "images/ppl1.png";
    }
}
