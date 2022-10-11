package pokemon;

import attack.Status.Coil;

public class Eelektross extends Eelektrik {
    public Eelektross(String name, int level) {
        super(name, level);
        this.setStats(85, 115, 80, 105,80, 50);

        this.addMove(new Coil());

    }
}
