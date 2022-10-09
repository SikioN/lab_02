package pokemon;

import ru.ifmo.se.pokemon.*;
public class Tynamo extends Pokemon {
    public Tynamo(String name, int level) {
        super(name, level);
        this.setStats(35, 55, 40, 45, 40, 60);
        this.setType(Type.ELECTRIC);
//        this.addMove();
    }
}
