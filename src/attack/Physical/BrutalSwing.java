package attack.Physical;

import ru.ifmo.se.pokemon.*;

public class BrutalSwing extends PhysicalMove {
    public BrutalSwing() {
        super(Type.DARK, 60, 100);
    }

    /**The user swings its body around violently to inflict
     * damage on everything in its vicinity.**/

    @Override
    protected String describe() {
        return "применяет BrutalSwing\uD83C\uDF2A";
    }
}
