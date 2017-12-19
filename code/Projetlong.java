/**
 * Write a description of class Projetlong here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Projetlong extends Virus 
{
    // Constructeur de Projetlong
    public Projetlong(Human h)
    {
        // id, statutsocial, classe Human, nom virus, letalite, risque contagion, zone contagion
        super(h.getID(), h.getStatut(), h, "Projetlong", 2, 30, 20);
        this.chemin_image = "images/bee.png";
    }
}
