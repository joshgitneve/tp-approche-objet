package fr.diginamic.essais;

/*
Permet de tester Operations avec 4 les operateurs
 */
import fr.diginamic.operations.Operations;

public class TestOperations {
    public static void main(String[] args) {
        double addition = Operations.calcul(1.1, 2.2, '+');
        double subtract = Operations.calcul(3.3, 4.4, '-');
        double multi = Operations.calcul(5.5, 6.6, '*');
        double divide = Operations.calcul(7.7, 8.7, '/');
        System.out.println("addition = " + addition);
        System.out.println("subtract = " + subtract);
        System.out.println("multi = " + multi);
        System.out.println("divide = " + divide);

        double vanFuelEconomie = Operations.calculFuelEconomie(54.48, 664.00);
        System.out.println("vanFuelEconomie = " + vanFuelEconomie);
    }

}
