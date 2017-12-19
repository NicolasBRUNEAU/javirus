import greenfoot.*;
import java.util.ArrayList;

public abstract class Virus extends Human
{
    // instance variables
    protected Human hum;
    private String name;
    protected int letalite;
    protected int risque_transmission;
    protected int zone_contagion;

    // Constructeur de Virus
    protected Virus(int id, int statut, Human h, String virus_name, int tx_letal, int risque_trans, int zone_contagion)
    {
        super(id, statut);
        hum = h;
        this.name = virus_name;
        this.letalite = tx_letal;
        this.risque_transmission = risque_trans;
        this.zone_contagion = zone_contagion;
    }
    
    // Ensemble Getter
    public abstract int getLetalite();
    public abstract int getZone();
    public abstract int getRisque();
}
