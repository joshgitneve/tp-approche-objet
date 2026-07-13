package fr.diginamic.combat;

public abstract class Potion {

    protected abstract String getNom();

    public abstract void consommer(Personnage p);

    public boolean getPotionActive() { return false;}

    public int getBonusForce() { return 0;}

    public void decrementerCombatsRestants(){}

    public int getCombatsRestants() {return 0;}

    @Override
    public String toString(){return getNom();}

}
