/*
Class qui instantie un tableau de doubles, sans taille, et contient des methodes pour agrandir
ce tableau en rajoutant un double et calculer la moyenne des doubles dans le tableau
à un moment donné.
 */

package fr.diginamic.operations;

public class CalculMoyenne {
    private double[] tableauDouble;

    public CalculMoyenne(){
        this.tableauDouble = new double[0];
    }

    public void ajout(double nombre) {
        double[] nouveauTableau = new double[tableauDouble.length + 1];
        System.arraycopy(tableauDouble, 0, nouveauTableau, 0, tableauDouble.length);
        nouveauTableau[tableauDouble.length] = nombre;
        tableauDouble = nouveauTableau;
    }
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
