package attack.Status;

import ru.ifmo.se.pokemon.*;

public class ThunderWave extends StatusMove {
    public ThunderWave() {
        super(Type.ELECTRIC, 0, 90);
    }

    /**Thunder Wave paralyzes the opponent.**/

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect effect = new Effect().condition(Status.PARALYZE).turns(-1);
        pokemon.addEffect(effect);
        super.applyOppEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "применяет Thunder Wave\uD83C\uDF20";
    }
}
