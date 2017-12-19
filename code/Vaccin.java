/**
 * Write a description of class Vaccin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
abstract class Vaccin  
{
    // instance variables - replace the example below with your own
    private String name;
    private int statutLimite;
    private int duree_efficacite;

    // Constructeur de Vaccin
    protected Vaccin(String name_vaccin, int lim_statut, int duree_efficacite)
    {
        this.name = name_vaccin;
        this.statutLimite = lim_statut;
        this.duree_efficacite = duree_efficacite;
    }

}
