package com.codewars.kata;

/**
 * Created by saoprb on 12/20/16.
 */
public class VasyaClerk {
    public static String Tickets(int[] peopleInLine) {
        int twentyFive = 0;
        int fifty = 0;
        int oneHundred = 0;

        for (int pay : peopleInLine) {
            if (pay == 25) {
                twentyFive++;
            } else if (pay == 50) {
                fifty++;
                twentyFive--;
            } else if (pay == 100) {
                oneHundred++;
                if (fifty > 0) {
                    fifty--;
                    twentyFive--;
                } else {
                    twentyFive--;
                    twentyFive--;
                    twentyFive--;
                }
            }
        }
        return (twentyFive < 0 || fifty < 0 || oneHundred < 0) ? "NO" : "YES";
    }
}
