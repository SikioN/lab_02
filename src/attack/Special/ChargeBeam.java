package attack.Special;

import ru.ifmo.se.pokemon.*;

public class ChargeBeam extends SpecialMove {
    public ChargeBeam() {
        super(Type.ELECTRIC, 50, 90);
    }

    /**Charge Beam deals damage and has a 70% chance
     * of raising the user's Special Attack by one stage.**/

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect effect = new Effect().chance(0.7).stat(Stat.SPECIAL_ATTACK, 1).turns(-1);
        pokemon.addEffect(effect);
    }

    @Override
    protected String describe() {
        return "применяет Charge Beam" + "\u001B[33m" + "\u26A1" + "\u001B[0m";
    }
}
