package attack.Special;

import ru.ifmo.se.pokemon.*;

public class Thunder extends SpecialMove {
    public Thunder() {
        super(Type.ELECTRIC, 110, 70);
    }

    /**Thunder deals damage and has a 30% chance
     * of paralyzing the target.**/

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect effect = new Effect().chance(0.3).condition(Status.PARALYZE);
        pokemon.addEffect(effect);
    }

    @Override
    protected String describe() {
        return "применяет Thunder⛈";
    }
}
