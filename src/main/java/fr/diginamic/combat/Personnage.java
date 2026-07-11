package fr.diginamic.combat;

public class Personnage {
    private int force;
    private int pointsDeSante;
    public Potion[] potions;

    public Personnage(int pointsDeSante, int force, Potion[] potions) {
        this.pointsDeSante = pointsDeSante;
        this.force = force;
        this.potions = potions;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getPointsDeSante() {
        return pointsDeSante;
    }

    public void setPointsDeSante(int pointsDeSante) {
        this.pointsDeSante = pointsDeSante;
    }
}
