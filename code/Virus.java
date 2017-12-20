import greenfoot.*;
import java.util.ArrayList;

public abstract class Virus extends Human
{
    // instance variables
    protected Human hum;

    // Constructeur de Virus
    protected Virus(Human h)
    {
        super(h.getStatut());
        hum = h;
    }

    public void addHuman(Human h){
        hum = h;
    }
    
    public boolean isInfected(Class<? extends Virus> vr){
        // recherche déja infecte par un virus (vr)
        return(this.getClass() == vr || hum.isInfected(vr));       
    }
}
