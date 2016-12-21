package com.codewars.kata;

/**
 * Created by saoprb on 12/20/16.
 */
public class TenMinWalk {
    public static boolean isValid(char[] directions) {

        int walkUpDown = 0;
        int walkLeftRight = 0;
        boolean withInTenMinutes = false;

        if (directions.length == 10)
            withInTenMinutes = true;

        for (char direction : directions) {
            switch (direction) {
                case 'n':
                    walkUpDown++;
                    break;
                case 's':
                    walkUpDown--;
                    break;
                case 'w':
                    walkLeftRight--;
                    break;
                case 'e':
                    walkLeftRight++;
                    break;
            }
        }

        return withInTenMinutes && walkUpDown == 0 && walkLeftRight == 0;
    }
}
