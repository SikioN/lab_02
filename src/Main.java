import pokemon.*;
import ru.ifmo.se.pokemon.*;

import static java.lang.Math.random;

public class Main {
    public static void main(String[] args) {
        Battle battle = new Battle();
        Pokemon dedenne = new Dedenne("Деденне", random_level());
        Pokemon onix = new Onix("Оникс", random_level());
        Pokemon steelix = new Steelix("Стиликс", random_level());

        Pokemon tynamo = new Tynamo("Тинамо", random_level());
        Pokemon eelektrik = new Eelektrik("Илектрик", random_level());
        Pokemon eelektross = new Eelektross("Илектросс", random_level());

        battle.addAlly(dedenne);
        battle.addAlly(onix);
        battle.addAlly(steelix);

        battle.addFoe(tynamo);
        battle.addFoe(eelektrik);
        battle.addFoe(eelektross);


    }

    static int random_level() {
        final int MIN = 1, MAX = 100;
        return MIN + (int) (random() * (MAX - MIN) + 1);
    }

}