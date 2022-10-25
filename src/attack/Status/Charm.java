package attack.Status;

import ru.ifmo.se.pokemon.*;

public class Charm extends StatusMove {
    public Charm() {
        super(Type.FAIRY, 0, 100);
    }

    /**Charm lowers the target's Attack by two stages.**/

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        pokemon.setMod(Stat.ATTACK, -2);
    }

    @Override
    protected String describe() {
        return "применяет Charm\uD83D\uDCAB";
    }

}
