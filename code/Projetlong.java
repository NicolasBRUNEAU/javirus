
public class Projetlong extends Virus 
{
    // Constructeur de Projetlong
    public Projetlong(Human h)
    {
        // id, statutsocial, classe Human, nom virus, letalite, risque contagion, zone contagion
        super(h.getID(), h.getStatut(), h, "Projetlong", 2, 30, 20);
        this.chemin_image = "images/ppl3.png";
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
