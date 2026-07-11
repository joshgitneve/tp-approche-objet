package fr.diginamic.combat;

public class PotionDeSoin extends Potion{
    private static final String NOM = "Potion de soin";

    @Override
    public String getNom(){return NOM;}

    @Override
    public void consommer(Personnage p){
        int soin = (int)(Math.random() * 6) + 5;
        p.setPointsDeSante(p.getPointsDeSante() + soin);
        System.out.println("Vous buvez " + NOM + " et récupérez " + soin + " points de santé!");
    }
}
