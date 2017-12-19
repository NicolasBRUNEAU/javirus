
public class Anr extends Virus 
{
    // Constructeur de Canardite
    public Anr(Human h)
    {
        // id, statutsocial, classe Human, nom virus, letalite, risque contagion, zone contagion
        super(h.getID(), h.getStatut(), h, "Anr", 10, 50, 20);
        this.chemin_image = "images/ppl2.png";
    }
    // Ensemble Getter
    public int getLetalite(){
        return this.letalite;
    }
    public int getZone(){
        return this.zone_contagion;
    }
    public int getRisque(){
        return this.risque_transmission;
    }
}
