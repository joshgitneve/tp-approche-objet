package fr.diginamic.operations;

/**
* Instantie un tableau de doubles vide, permet d'ajouter des valeurs
* et de calculer leur moyenne.
* @author JoshuaNEVE
* @version 1.0
 */



public class CalculMoyenne {
    private double[] tableauDouble;

    public CalculMoyenne(){
        this.tableauDouble = new double[0];
    }
    /**
     *  permet d'ajouter un nouvel valeur double a l'instance du tableau.
    * @param nombre le double à ajouter
    */
    public void ajout(double nombre) {
        double[] nouveauTableau = new double[tableauDouble.length + 1];
        System.arraycopy(tableauDouble, 0, nouveauTableau, 0, tableauDouble.length);
        nouveauTableau[tableauDouble.length] = nombre;
        tableauDouble = nouveauTableau;
    }
    /**
     * Calcule et retourne la moyenne des valeurs ajoutées.
     * @return la moyenne, ou 0 si aucune valeur n'a été ajouté
     */
    public double calcul(){
        if (tableauDouble.length == 0){
            return 0;
        }
        double total = 0;
        for (double i : tableauDouble){
            total += i;
        }
        return total / tableauDouble.length;
    }


}
