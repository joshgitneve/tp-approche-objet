package fr.diginamic.combat;

public abstract class Creature {
    protected int force;
    protected int pointsDeSante;

    public Creature(int force, int pointsDeSante){
        this.force = force;
        this.pointsDeSante = pointsDeSante;
    }

    public abstract int getScoreBonus();

    public int getForce() {
        return force;
    }

    public int getPointsDeSante() {
        return pointsDeSante;
    }

    public void setPointsDeSante(int points) {
        this.pointsDeSante = points;
    }
    @Override
    public String toString() {
        return getClass().getSimpleName() + " (force: " + force + ", santé: " + pointsDeSante + ")";
    }
}
