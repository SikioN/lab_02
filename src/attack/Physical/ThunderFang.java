package attack.Physical;

import ru.ifmo.se.pokemon.*;

public class ThunderFang extends PhysicalMove {
    public ThunderFang() {
        super(Type.ELECTRIC, 65, 95);
    }

    /**Thunder Fang deals damage, has a 10% chance of paralyzing the target,
     * and has a 10% chance of causing the target to flinch.**/

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect effect = new Effect().chance(0.1).condition(Status.PARALYZE);
        pokemon.addEffect(effect);
        super.applyOppEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "применяет Thunder Fang\uD83C\uDF1F";
    }
}
