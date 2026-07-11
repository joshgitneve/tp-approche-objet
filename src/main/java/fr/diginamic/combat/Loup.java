package fr.diginamic.combat;

public class Loup extends Creature {
    public Loup() {
        super(
                (int)(Math.random() * 6) + 3,
                (int)(Math.random() * 6) + 5
        );
    }

    @Override
    public int getScoreBonus() {
        return 1;
    }
}
