package attack.Physical;

import ru.ifmo.se.pokemon.*;

public class StoneEdge extends PhysicalMove {
    public StoneEdge() {
        super(Type.ROCK, 100, 80);
    }

    /**Stone Edge deals damage.**/

    @Override
    protected String describe() {
        return "применяет Stone Edge\uD83E\uDEA8";
    }
}
