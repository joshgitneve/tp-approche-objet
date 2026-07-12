package fr.diginamic.combat;

public class Gobelin extends Creature {
    public Gobelin() {
        super(
                (int)(Math.random() * 6) + 5,
                (int)(Math.random() * 6) + 10
        );
    }

    @Override
    public int getScoreBonus() {
        return 2;
    }
    @Override
    public String toString() {
        return """
                 ,      ,
                                 /(.-""-.)\\
                             |\\  \\/      \\/  /|
                             | \\ / =.  .= \\ / |
                             \\( \\   o\\/o   / )/
                              \\_, '-/  \\-' ,_/
                                /   \\__/   \\
                                \\ \\__/\\__/ /
                              ___\\ \\|--|/ /___
                            /`    \\      /    `\\
                           /       '----'       \\
                GOBLIN!
               Force: %d, Santé: %d
               """.formatted(force, pointsDeSante);
    }
}