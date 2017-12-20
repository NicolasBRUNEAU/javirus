import greenfoot.*;
import java.util.ArrayList;

public abstract class Vaccin extends Human
{
    // instance variables
    protected Human hum;
    private String name;
    
    // Constructeur de Vaccin
    protected Vaccin(Human h)
    {
        super(h.getStatut());
        hum = h;
    }
    
    public boolean isImmunised(Class<? extends Vaccin> vc){
        // recherche déja immunise par vaccin (vc)
        return(this.getClass() == vc || hum.isImmunised(vc));
    }
}

