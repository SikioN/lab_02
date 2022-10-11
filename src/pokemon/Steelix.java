package pokemon;

import attack.Physical.ThunderFang;
import ru.ifmo.se.pokemon.*;

public class Steelix extends Onix {
    public Steelix(String name, int level) {
        super(name, level);
        this.setStats(75, 85, 200, 55, 65, 30);
        this.addType(Type.STEEL);

        this.addMove(new ThunderFang());

    }
}
