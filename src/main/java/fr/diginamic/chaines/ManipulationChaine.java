package fr.diginamic.chaines;

import fr.diginamic.entites.Salarie;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ManipulationChaine {
    public static void main(String[] args) {

        String chaine = "Durand;Marcel;2 523.5";

        char premierCaractere = chaine.charAt(0);
        System.out.println("Premier caractère: " + premierCaractere);

        /**
         * afficher la longueur de la chaine
         */
        System.out.println("La longueur de la chaine : " + chaine.length() + " caracteres.");

        /**
         * afficher l'index du premier <<;>>
         */
        System.out.println(chaine.indexOf(";"));

        /**
         * d’extraire une portion de chaine de caractères comprise entre un index
         * de début (inclus) et un index de fin (exclu) en utilisant substring et
         * indexOf
         */
        System.out.println(chaine.substring((chaine.indexOf("D")), (chaine.indexOf(";"))));

        System.out.println(chaine.substring((chaine.indexOf("D")), (chaine.indexOf(";"))).toUpperCase());
        System.out.println(chaine.substring((chaine.indexOf("D")), (chaine.indexOf(";"))).toLowerCase());

        String[] tableau = chaine.split(";");
        System.out.println("tableau = " + Arrays.toString(tableau));

        String salaireNettoye = tableau[2].replace(" ", "");
        double salaire = Double.parseDouble(salaireNettoye);

        Salarie mDurrand = new Salarie(tableau[0], tableau[1], salaire);
        System.out.println("mDurrand = " + mDurrand);



    }
}
