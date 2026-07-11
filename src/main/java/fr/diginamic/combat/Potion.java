package fr.diginamic.combat;

public abstract class Potion {

    public abstract String getNom();

    public abstract void consommer(Personnage p);


    @Override
    public String toString(){
        return getNom();
    }
}
