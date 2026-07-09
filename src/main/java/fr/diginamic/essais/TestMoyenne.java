/*
Class de test qui crée des instances de CalculMoyenne et les tests avec des doubles positives et negatives. Deux tests.
 */

package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {
    public static void main(String[] args) {
        // Test 1 - positives -
        CalculMoyenne cal1 = new CalculMoyenne();
        cal1.ajout(1.1);
        cal1.ajout(2.2);
        cal1.ajout(3.3);
        System.out.println("la moyenne du  tableau de cal1 est de " + cal1.calcul() + " apres 3 ajouts");
        cal1.ajout(4.4);
        cal1.ajout(5.5);
        cal1.ajout(6.6);
        System.out.println("la moyenne du  tableau de cal1 est de " + cal1.calcul() + " apres 6 ajouts");


        // Test 2 - negatives
        CalculMoyenne cal2 = new CalculMoyenne();
        cal2.ajout(-10.1);
        cal2.ajout(-20.2);
        cal2.ajout(-30.3);
        System.out.println("la moyenne du  tableau de cal2 est de " + cal2.calcul() + " apres 3 ajouts");
        cal2.ajout(-40.4);
        cal2.ajout(-50.5);
        cal2.ajout(-60.6);
        System.out.println("la moyenne du  tableau de cal2 est de " + cal2.calcul() + " apres 6 ajouts");
    }
}
