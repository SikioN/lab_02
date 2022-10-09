package pokemon;

import ru.ifmo.se.pokemon.*;

public class Dedenne extends Pokemon {
    public Dedenne(String name, int level) {
        super(name, level);
        this.setStats(67, 58, 57, 81, 67, 101);
        this.setType(Type.ELECTRIC, Type.FAIRY);
//        this.addMove();
    }
}
