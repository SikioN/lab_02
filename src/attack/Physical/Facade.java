package attack.Physical;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 100);
    }

    /**Facade deals damage, and hits with double power (140)
     * if the user is burned, poisoned or paralyzed.**/

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (pokemon.getCondition() == Status.PARALYZE || pokemon.getCondition() == Status.POISON || pokemon.getCondition() == Status.BURN) {
            pokemon.setMod(Stat.ATTACK, 2);
        }
    }

    @Override
    protected String describe() {
        return "применяет Facade\uD83D\uDC7B";
    }
}
