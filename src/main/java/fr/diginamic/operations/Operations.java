package fr.diginamic.operations;
/*
Contient une methode statique pour faire des calculs selon l'operateur choisi.
Permet de rentrer un de quatre operateurs: +, -, *, /, et deux valeurs double à traiter.
@author JoshuaNEVE
@version 1.0

 */



public class Operations {
    /* Calculer une operation sur deux chiffres double données
    avec un operateur donné en argument
    @param double a
    @param double b
    @param operateur (+, -, *, ou /
     */
    public static double calcul(double a, double b, char operateur){
        return switch (operateur) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            default -> throw new IllegalArgumentException("Opérateur inconnu");
        };

    }
}
