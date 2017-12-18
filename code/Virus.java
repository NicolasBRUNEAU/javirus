/**
 * Write a description of class Virus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Virus  
{
    // instance variables - replace the example below with your own
    private String name;
    private int letalite;
    private int risque_transmission;
    private int zone_contagion;
    private String corr_vaccin;
    private String chemin_image;

    // Constructeur de Virus
    public Virus(String virus_name, int tx_letal, int risque_trans, int zone_contagion, String vaccin, String filename)
    {
        this.name = virus_name;
        this.letalite = tx_letal;
        this.risque_transmission = risque_trans;
        this.zone_contagion = zone_contagion;
        this.corr_vaccin = vaccin;
        this.chemin_image = filename;
    }
}
