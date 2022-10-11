package pokemon;

import attack.Physical.Spark;

public class Eelektrik extends Tynamo{
    public Eelektrik(String name, int level) {
        super(name, level);
        this.setStats(65, 85, 70, 75, 70, 40);

        this.addMove(new Spark());

    }
}
