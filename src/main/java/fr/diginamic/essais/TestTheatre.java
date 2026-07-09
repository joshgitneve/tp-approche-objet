package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {
    public static void main(String[] args) {

        Theatre theatre1 = new Theatre("La comedie", 90);
        theatre1.inscrire(45, 34.00);
        theatre1.inscrire(33, 37.00);
        theatre1.inscrire(12, 56.00);
        theatre1.inscrire(3, 67.00);

        System.out.println("Nombre de clients inscrits: " + theatre1.getTotaleClientsInscrits());
        System.out.println("Totale recettes de l'établissment :" + theatre1.getRecetteTotale());
    }
}
