package pokemon;

import ru.ifmo.se.pokemon.*;

public class Onix extends Pokemon {
    public Onix(String name, int level) {
        super(name, level);
        this.setStats(35, 45, 160, 30, 45, 70);
        this.setType(Type.ROCK, Type.GROUND);
//        this.addMove();
    }
}
