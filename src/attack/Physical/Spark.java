package attack.Physical;

import ru.ifmo.se.pokemon.*;

public class Spark extends PhysicalMove {
    public Spark() {
        super(Type.ELECTRIC, 65, 100);
    }

    /**Spark deals damage and has a 30% chance of paralyzing the target.**/

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect effect = new Effect().chance(0.3).condition(Status.PARALYZE);
        pokemon.addEffect(effect);
        super.applyOppEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "применяет Spark\uD83D\uDC7B";
    }
}
