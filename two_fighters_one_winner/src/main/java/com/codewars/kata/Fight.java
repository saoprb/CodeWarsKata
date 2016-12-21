package com.codewars.kata;

import java.lang.reflect.Array;

/**
 * Created by saoprb on 12/20/16.
 */
public class Fight {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        Fighter firstAttack;
        Fighter secondAttack;
        if (firstAttacker.equals(fighter1.name)) {
            firstAttack = fighter1;
            secondAttack = fighter2;
        } else {
            firstAttack = fighter2;
            secondAttack = fighter1;
        }
        while (firstAttack.health > 0 && secondAttack.health > 0) {
            secondAttack.health -= firstAttack.damagePerAttack;
            if (secondAttack.health <= 0) break;
            firstAttack.health -= secondAttack.damagePerAttack;
            if (firstAttack.health <= 0) break;
        }
        return (firstAttack.health > secondAttack.health) ? firstAttack.name : secondAttack.name;
    }
}
