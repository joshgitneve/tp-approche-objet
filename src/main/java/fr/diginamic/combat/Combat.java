package fr.diginamic.combat;

public class Combat {
    private Personnage personnage;
    private Creature creature;

    public Combat(Personnage p, Creature c){
        this.personnage = p;
        this.creature = c;
    }
    public void combattre(){
        System.out.println("Vous rencontrez: \n" + creature);
        while (personnage.getPointsDeSante() > 0 && creature.getPointsDeSante() > 0){
            int attaqueP = calculerAttaque(personnage.getForceEffective());
            int attaqueC = calculerAttaque(creature.getForce());

            if (attaqueP > attaqueC){
                creature.setPointsDeSante(creature.getPointsDeSante() - (attaqueP - attaqueC));
            } else if (attaqueC > attaqueP) {
                personnage.setPointsDeSante(personnage.getPointsDeSante() - (attaqueC-attaqueP));
            }
        }
        if (personnage.getPointsDeSante() > 0){
            personnage.setScore(personnage.getScore() + creature.getScoreBonus());
            System.out.println("Vous avez vaincu \n" + creature + "! Score: " + personnage.getScore());
            decrementerPotions();
            attribuerRecompense();

        } else {
            System.out.println("Vous êtes mort! Score final: " + personnage.getScore());
        }
    }

    private int calculerAttaque(int force){
            return force + ((int)(Math.random() * 10) + 1);
    }

    private void decrementerPotions(){
        for (Potion potion : personnage.getPotions()){
            if (potion.getPotionActive()){
                potion.decrementerCombatsRestants();
            }
        }
    }


    private void attribuerRecompense() {
        if (Math.random() < 0.5) {
            int recompense = (int)(Math.random() * 4);
            switch (recompense) {
                case 0 -> {
                    personnage.ajouterPotion(new PotionDeSoin());
                    System.out.println("Vous recevez une Potion de Soin!");
                }
                case 1 -> {
                    personnage.ajouterPotion(new PotionAttaqueMineure());
                    System.out.println("Vous recevez une potion d'attaque mineure!");
                }
                case 2 -> {
                    personnage.ajouterPotion(new PotionAttaqueMajeure());
                    System.out.println("Vous recevez une potion d'attaque majeure!");
                }
                case 3 -> {
                    personnage.setScore(personnage.getScore() + 5);
                    System.out.println("Vous recevez 5 points!");
                }
            }
            System.out.println("\nMaintenant vous étes plus puissant! Prochain combat!!");
        } else {
            System.out.println(" Pas de chance!! Pas de récompense cette fois :'( ");

        }

    }





}
