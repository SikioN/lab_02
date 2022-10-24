package attack.Status;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, 0, 0);
    }

    /**User sleeps, but user is fully healed.**/

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect effect = new Effect().condition(Status.SLEEP);
//        pokemon.setStats(Stat.HP, 1);
        pokemon.addEffect(effect);
    }

    @Override
    protected String describe() {
        return "применяет Rest\uD83D\uDCA4";
    }
}
