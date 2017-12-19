import greenfoot.*;
import java.util.ArrayList;

public abstract class Vaccin extends Human
{
    // instance variables
    protected Human hum;
    private String name;
    protected int statutLimite;
    protected int duree_efficacite;
    protected int proba_resistance;

    // Constructeur de Vaccin
    protected Vaccin(int id, int statut, Human h, String name_vaccin, int lim_statut, int duree_efficacite, int prob_resistance)
    {
        super(id, statut);
        hum = h;
        this.name = name_vaccin;
        this.statutLimite = lim_statut;
        this.duree_efficacite = duree_efficacite;
        this.proba_resistance = prob_resistance;
    }
    
    // Ensemble getter
    public int getLimite(){
        return this.statutLimite;
    }
    public int getDuree(){
        return this.duree_efficacite;
    }
    public int getResistance(){
        return this.proba_resistance;
    }
}

