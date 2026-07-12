package fr.diginamic.combat;

import fr.diginamic.maison.Piece;

public class Personnage {
    private int force;
    private int pointsDeSante;
    private int score;
    private Potion[] potions;

    public Personnage() {
        this.force = (int)(Math.random() * 7) + 12;
        this.pointsDeSante = (int)(Math.random() * 31) + 20;
        this.score = 0;
        this.potions = new Potion[]{
                new PotionDeSoin(),
                new PotionAttaqueMineure(),
                new PotionAttaqueMajeure()
        };

    }

    public void ajouterPotion(Potion potion){
        Potion[] newPotions = new Potion[potions.length + 1];
        System.arraycopy(potions, 0, newPotions, 0, potions.length);
        newPotions[potions.length] = potion; potions = newPotions;
    }

    public int getForceEffective(){
        int bonus = 0;
        for (Potion potion : potions){
            if (potion.getPotionActive()){bonus = potion.getBonusForce();}
        }
        return bonus + force;
    }

    public int getForce() {
        return force;
    }

    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }

    public Potion[] getPotions() {
        return potions;
    }

    public int getPointsDeSante() {
        return pointsDeSante;
    }

    public void setPointsDeSante(int pointsDeSante) {
        this.pointsDeSante = pointsDeSante;
    }
}
