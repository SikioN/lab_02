package attack.Status;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger() {
        super(Type.NORMAL, 0, 85);
    }

    /**Swagger confuses the target and raises its Attack by two stages.**/

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.confuse();
        pokemon.setMod(Stat.ATTACK, 2);
    }

    @Override
    protected String describe() {
        return "применяет Swagger♠";
    }
}
