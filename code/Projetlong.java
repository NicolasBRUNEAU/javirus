
public class Projetlong extends Virus 
{
    public static int zone_contagion = 100;
    public static int letalite = 2;
    public static int risque_transmission = 30;
    public static String name = "Projetlong";
    
    // Constructeur de Projetlong
    public Projetlong(Human h)
    {
        // id, statutsocial, classe Human, nom virus, letalite, risque contagion, zone contagion
        super(h.getID(), h.getStatut(), h);
        this.chemin_image = "images/ppl3.png";
    }
}
