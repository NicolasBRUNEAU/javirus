import greenfoot.*;
import java.util.ArrayList;

public abstract class Virus extends Human
{
    // instance variables
    protected Human hum;


    // Constructeur de Virus
    protected Virus(int id, int statut, Human h)
    {
        super(id, statut);
        hum = h;
    }

    public void addHuman(Human h){
        hum = h;
    }
 
}
