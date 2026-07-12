package fr.diginamic.combat;

public class PotionAttaqueMajeure extends Potion {
    private static final String NOM = "Potion d'attaque majeure";
    private boolean potionActive = false;
    private int combatsRestants = 2;

    @Override
    public String getNom() {
        return NOM;
    }

    @Override
    public void consommer(Personnage p) {
        System.out.println("Vous buvez " + NOM + " et récupérez de la force!");
        potionActive = true;
    }
    @Override
    public int getBonusForce() {
        return 5;
    }

    @Override
    public boolean getPotionActive() {
        return potionActive;
    }

    public int getCombatsRestants() {
        return combatsRestants;
    }
    public void decrementerCombatsRestants(){
        this.combatsRestants -= 1;
    }

}