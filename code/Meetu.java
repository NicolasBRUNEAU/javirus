import java.util.ArrayList;


public class Meetu extends Virus 
{    
    public Meetu(Human h)
    {
        // id, statutsocial, classe Human, nom virus, letalite, risque contagion, zone contagion
        super(h.getID(), h.getStatut(), h, "Meetu", 2, 50, 150);
        this.chemin_image = "images/ppl1.png";
    }
}
