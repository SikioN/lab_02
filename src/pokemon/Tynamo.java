package pokemon;

import attack.Special.ChargeBeam;
import attack.Status.ThunderWave;
import ru.ifmo.se.pokemon.*;

public class Tynamo extends Pokemon {
    public Tynamo(String name, int level) {
        super(name, level);
        this.setStats(35, 55, 40, 45, 40, 60);
        this.setType(Type.ELECTRIC);

        this.addMove(new ThunderWave());
        this.addMove(new ChargeBeam());

    }
}
