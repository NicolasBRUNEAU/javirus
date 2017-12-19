import greenfoot.*;
import java.util.ArrayList;

public abstract class Vaccin extends Human
{
    // instance variables
    private String name;
    private int statutLimite;
    private int duree_efficacite;
    private int proba_resistance;

    // Constructeur de Vaccin
    protected Vaccin(String name_vaccin, int lim_statut, int duree_efficacite, int prob_resistance)
    {
         super(id, statut);
        hum = h;
        this.name = virus_name;
        this.letalite = tx_letal;
        this.risque_transmission = risque_trans;
        this.zone_contagion = zone_contagion;
    }
}

/*   protected Virus(int id, int statut, Human h, String virus_name, int tx_letal, int risque_trans, int zone_contagion)
    {
        super(id, statut);
        hum = h;
        this.name = virus_name;
        this.letalite = tx_letal;
        this.risque_transmission = risque_trans;
        this.zone_contagion = zone_contagion;
    }
 */
