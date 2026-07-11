package fr.diginamic.essais;

import java.util.Arrays;
import fr.diginamic.maison.*;

public class TestMaison {
    public static void main(String[] args) {
        Maison maMaison = new Maison();
        Piece chambre1 = new Chambre(14.0, 1);
        Piece chambre2 = new Chambre(16.5, 1);
        Piece chambre3 = new Chambre(20.0, 1);
        Piece SDB1 = new SalleDeBain(6.0, 1);
        Piece SDB2 = new SalleDeBain(5.0, 1);
        Piece toilet = new WC(2.0, 1);
        Piece toilet2 = new WC(3.0, 0);
        Piece salon1 = new Salon(18.0, 0);
        Piece salon2 = new Salon(18.0, 0);
        Piece chambre4 = new Chambre(12.0, 0);
        Piece chambre5 = new Chambre(12.0, 0);
        Piece cuisine1 = new Cuisine(22.0, 0);
        Piece cuisine2 = new Cuisine(12.0, -1);
        Piece cuisine3 = new Cuisine(-12.0, 0);

        maMaison.ajouterPiece(chambre1);
        maMaison.ajouterPiece(chambre2);
        maMaison.ajouterPiece(chambre3);
        maMaison.ajouterPiece(chambre4);
        maMaison.ajouterPiece(chambre5);
        maMaison.ajouterPiece(SDB1);
        maMaison.ajouterPiece(SDB2);
        maMaison.ajouterPiece(toilet);
        maMaison.ajouterPiece(toilet2);
        maMaison.ajouterPiece(salon1);
        maMaison.ajouterPiece(salon2);
        maMaison.ajouterPiece(cuisine1);

        /**
         * Prints all rooms in one line
         */
        System.out.println(Arrays.toString(maMaison.getListOfRooms()));

        /**
         * prints all rooms, one room per line.
         */
        for (Piece room : maMaison.getListOfRooms()){
            System.out.println(room);
        }

        /**
         * Tests qui verifie que une piece null ne peut pas etre rajouter à l'Array.
         * Devrait recevoir un message "Impossible d'ajouter une piece null"
         */
        maMaison.ajouterPiece(null);


        /**
         * Prints the return from calculSuperficieParEtage for RDC
         */
        System.out.println("Superficie du RDC: " + maMaison.calculSuperficieParEtage(0));

        /**
         * Prints the return from calculSuperficieParEtage for premier étage.
         */
        System.out.println("\nSuperficie à l'étage: " + maMaison.calculSuperficieParEtage(1));

        /**
         * Print la superficie totale d'une maison donnée.
         */
        System.out.println("Total superficie : " + maMaison.calculSuperficieTotale());

        /**
         * The following calls print the return from calculSuperficieParType according to
         * whichever type is passed to afficherSuperficieParType()
         */
        maMaison.afficherSuperficieParType(Chambre.class);
        maMaison.afficherSuperficieParType(Salon.class);
        maMaison.afficherSuperficieParType(WC.class);
        maMaison.afficherSuperficieParType(Cuisine.class);
        maMaison.afficherSuperficieParType(SalleDeBain.class);

        /**
         * The following calls print the return from calculNombreParType according to
         *          * whichever type is passed to afficherNombreParType()
         */
        maMaison.afficherNombreParType(Chambre.class);
        maMaison.afficherNombreParType(Salon.class);
        maMaison.afficherNombreParType(WC.class);
        maMaison.afficherNombreParType(Cuisine.class);
        maMaison.afficherNombreParType(SalleDeBain.class);
    }
}
