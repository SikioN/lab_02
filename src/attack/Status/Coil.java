package attack.Status;

import ru.ifmo.se.pokemon.*;

public class Coil extends StatusMove {
    public Coil() {
        super(Type.POISON, 0, 0);
    }

    /**Coil raises the user's Attack, Defense and Accuracy by one stage each.**/

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.ATTACK, 1);
        pokemon.setMod(Stat.DEFENSE, 1);
        pokemon.setMod(Stat.ACCURACY, 1);
    }

        @Override
    protected String describe() {
        return "применяет Coil\uD83E\uDDEA";
    }
}
