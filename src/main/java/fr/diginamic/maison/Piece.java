package fr.diginamic.maison;

public abstract class Piece {
    protected double superficie;
    protected int numeroEtage;

    public Piece(double superficie, int numeroEtage) {
        if (superficie > 0){
            this.superficie = superficie;}
        else {
            System.out.println("Superficie doit etre superieure à zero");}
        if (numeroEtage >= 0){
            this.numeroEtage = numeroEtage;}
        else {
            System.out.println("Étage doit etre égal ou superieure à zero");
        }
    }

    @Override
    public String toString() {
        return "Piece{" +
                "superficie = " + superficie + "m² }";
    }
}
