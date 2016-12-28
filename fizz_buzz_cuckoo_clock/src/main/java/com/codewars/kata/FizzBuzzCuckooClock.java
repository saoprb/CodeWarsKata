package com.codewars.kata;

/**
 * Created by saoprb on 12/28/16.
 */
public class FizzBuzzCuckooClock {
    private final static String cuckoo = "Cuckoo ";
    private final static String tick = "tick";
    private final static String fizz = "Fizz";
    private final static String buzz = "Buzz";
    private final static String fizzbuzz = "Fizz Buzz";

    public static String fizzBuzzCuckooClock(String clockTime) {
        StringBuffer clockSound = new StringBuffer();
        int hour = Integer.parseInt(clockTime.split(":")[0]) % 12;
        int min = Integer.parseInt(clockTime.split(":")[1]);

        if (min == 0) {
            hour = hour == 0 ? 12 : hour;
            for (int times = 0; times < hour; times++) {
                clockSound.append(cuckoo);
            }
        } else if (min == 30) {
            clockSound.append(cuckoo);
        } else if (min % 3 == 0 && min % 5 == 0) {
            clockSound.append(fizzbuzz);
        } else if (min % 3 == 0) {
            clockSound.append(fizz);
        } else if (min % 5 == 0) {
            clockSound.append(buzz);
        } else {
            clockSound.append(tick);
        }

        return clockSound.toString().trim();
    }
}
