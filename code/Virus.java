import greenfoot.*;
import java.util.ArrayList;

public abstract class Virus extends Human
{
    // instance variables
    protected Human hum;
    private String name;

    // Constructeur de Virus
    protected Virus(int id, int statut, Human h, String virus_name)
    {
        super(id, statut);
        hum = h;
        this.name = virus_name;
    }

}
