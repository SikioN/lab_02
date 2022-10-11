import pokemon.*;
import ru.ifmo.se.pokemon.*;

import static java.lang.Math.random;

public class Main {
    public static void main(String[] args) {
        final int MIN = 1, MAX = 100;


        Battle battle = new Battle();
        Pokemon dedenne = new Dedenne("Dedenne", MIN + (int) (random() * (MAX - MIN) + 1));
        Pokemon onix = new Onix("Onix", MIN + (int) (random() * (MAX - MIN) + 1));
        Pokemon steelix = new Steelix("Steelix", MIN + (int) (random() * (MAX - MIN) + 1));

        Pokemon tynamo = new Tynamo("Tynamo", MIN + (int) (random() * (MAX - MIN) + 1));
        Pokemon eelektrik = new Eelektrik("Eelektrik", MIN + (int) (random() * (MAX - MIN) + 1));
        Pokemon eelektross = new Eelektross("Eelektross", MIN + (int) (random() * (MAX - MIN) + 1));

        battle.addAlly(dedenne);
        battle.addAlly(onix);
        battle.addAlly(steelix);

        battle.addFoe(tynamo);
        battle.addFoe(eelektrik);
        battle.addFoe(eelektross);

        battle.go();

    }
}