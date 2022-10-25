package attack.Status;

import ru.ifmo.se.pokemon.*;
public class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, 0, 100);
    }

    /**
     * User sleeps, but user is fully healed.
     **/

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect effect = new Effect().condition(Status.SLEEP);
        int full_hp = (int)Math.ceil(pokemon.getStat(Stat.HP) - pokemon.getHP());
        pokemon.setMod(Stat.HP, -full_hp);
    }

    @Override
    protected String describe() {
        return "применяет Rest\uD83D\uDCA4";
    }
}
