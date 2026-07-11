package fr.diginamic.maison;

public class WC extends Piece{
    public WC(double superficie, int numeroEtage){
        super(superficie, numeroEtage);
    }

    @Override
    public String toString() {
        return "WC — " + super.toString();
    }
}
