package fr.diginamic.combat;

public class PotionAttaqueMineure extends Potion{
    private static final String NOM = "Potion d'attaque mineure";
    private boolean potionActive = false;
    private int combatsRestants = 1;


    @Override
    public String getNom(){return NOM;}

    @Override
    public void consommer(Personnage p){
        System.out.println("Vous buvez " + NOM + " et récupérez de la force!");
        potionActive = true;

    }
    @Override
    public int getBonusForce() {
        return 3;
    }

    @Override
    public boolean getPotionActive(){
        return potionActive;
    }

    public int getCombatsRestants() {
        return combatsRestants;
    }
    public void decrementerCombatsRestants(){
        this.combatsRestants -= 1;
        if (combatsRestants <= 0){
            potionActive = false;
        }
    }
}

