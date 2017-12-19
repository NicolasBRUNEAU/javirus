import greenfoot.*;
import java.util.ArrayList;

public abstract class Virus extends Human
{
    // instance variables
    protected Human hum;
    private String name;
    private int letalite;
    private int risque_transmission;
    private int zone_contagion;

    //"ANR", 10, 50, 20, "Anti_Anr"
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
}
