package fr.diginamic.entites;

/**
 * Permet de créer un Theatre objet avec un nom et une capacité maximum,
 * puis rajouter des nombres de clients jusqu'a la capacité est atteiente
 * et calculer la totale des recettes de l'etablissment.
 *
 */
public class Theatre {
    private String nom;
    private int capaciteMax;
    private int totaleClientsInscrits;
    private double recetteTotale;

    /**
     * Créer un objet Theatre.
     * @param nom nom du theatre crée
     * @param capaciteMax
     */
    public Theatre(String nom, int capaciteMax){
        this.nom = nom;
        this.capaciteMax = capaciteMax;
    }

    /**
     * Inscrire des clients et recalculer recetteTotale.
     * @param nbClients nombre de clients inscrits au theatre
     *
     */
    public void inscrire(int nbClients, double prixPlace){
        if (this.totaleClientsInscrits + nbClients <= this.capaciteMax){
            this.totaleClientsInscrits += nbClients;
            this.recetteTotale += nbClients * prixPlace;
            System.out.println("Reservation avec succès! Profitez bien du spectacle!");
        } else {
            System.out.println("Capacité maximale atteinte!");
        }
    }

    public int getTotaleClientsInscrits() {
        return totaleClientsInscrits;
    }

    /**
     * @return totales recettes du theatre
     */
    public double getRecetteTotale() {
        return recetteTotale;
    }
}
