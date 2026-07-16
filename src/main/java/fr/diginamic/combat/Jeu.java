package fr.diginamic.combat;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Jeu {
    private Personnage personnage = null;
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new Jeu().demarrer();
    }

    public void demarrer() {
        int choix = 0;
        while (true) {
            afficherMenu();
            try {
                choix = scanner.nextInt();
                switch (choix) {
                    case 1 -> {
                        personnage = new Personnage();
                        System.out.println("Personnage créé! Force: " + personnage.getForce() +
                                ", Santé: " + personnage.getPointsDeSante());
                    }
                    case 2 -> {
                        if (personnage == null) {
                            System.out.println("Créez d'abord un personnage!");
                        } else {
                            new Combat(personnage, createCreature()).combattre();
                        }
                    }
                    case 3 -> {
                        if (personnage == null) {
                            System.out.println("Créez d'abord un personnage!");
                        } else prendrePotion();
                    }
                    case 4 -> {
                        if (personnage == null) {
                            System.out.println("Créez d'abord un personnage!");
                        } else {
                            System.out.println(" Votre score est actuellement de " + personnage.getScore());
                        }
                    }
                    case 5 -> {
                        scanner.close();
                        if (personnage == null) {
                            System.out.println("Mais tu n'a même pas joué!");
                        } else {
                            System.out.println("Vous quittez avec un score de " +
                                    personnage.getScore() + "! Merci pour votre visite!");
                        }
                        return;
                    }
                    default -> throw new IllegalArgumentException("Entrez une choix valide");

                }
            } catch (IllegalArgumentException e) {
                System.out.println("Choix invalide — entrez un nombre entre 1 et 5.");
            } catch (InputMismatchException e) {
            System.out.println("Entrez un chiffre!");
            scanner.nextLine();   // clears the bad input from the buffer
        }
        }
    }

    private Creature createCreature () {
        Creature[] bestiaire = {
                new Loup(), new Gobelin(), new Troll()};
        return bestiaire[(int) (Math.random() * bestiaire.length)];
    }

    private static void afficherMenu () {
        System.out.println("\n--- GAME MENU ---");
        System.out.println("1. Créer un personnage");
        System.out.println("2. Combattre un adversaire");
        System.out.println("3. Prendre une potion");
        System.out.println("4. Afficher score");
        System.out.println("5. Quitter");
        System.out.println("Votre choix : ");
    }

    private void prendrePotion(){
        Potion[] potions = personnage.getPotions();
        if (potions.length == 0) {
            System.out.println("Vous n'avez plus de potions!");
            return;
        }
        for (int i = 0; i < potions.length; i++) {
            String display = (i + 1) + ". " + potions[i].getNom();
            if (potions[i].getPotionActive()) {
                display += " (active — " + potions[i].getCombatsRestants() + " combat(s) restant(s))";
            }
            System.out.println(display);
        }
        System.out.println("Choisissez une option : ");
        int choice = scanner.nextInt() -1;
        if (choice < 0 || choice >= potions.length) {
            System.out.println("Choix invalide!");
            return;
        }
        potions[choice].consommer(personnage);
        if (potions[choice] instanceof PotionDeSoin){
            personnage.retirerPotion(choice);
        }

    }
}









