/**
 * Write a description of class Anr here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Anr extends Virus 
{
    // Constructeur de Canardite
    public Anr(Human h)
    {
        // id, statutsocial, classe Human, nom virus, letalite, risque contagion, zone contagion
        super(h.getID(), h.getStatut(), h, "Anr", 10, 50, 20);
        this.chemin_image = "images/ant3.png";
    }
}
