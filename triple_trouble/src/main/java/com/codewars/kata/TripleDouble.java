package com.codewars.kata;

/**
 * Created by saoprb on 12/20/16.
 */
public class TripleDouble {
    public static int kata(long num1, long num2) {
        long straightTripleNumber = findStraightNumber(num1, 3, 0);
        long straightDoubleNumber = findStraightNumber(num2, 2, straightTripleNumber);
        return straightTripleNumber != -1 && straightDoubleNumber != -1 ? 1 : 0;
    }

    public static long findStraightNumber(long number, int countLimit, long countOnlyByThisNumber) {
        int countDigit = 0;
        long localNumber = number;
        long currentDigit = -1;
        long nextDigit = -1;

        while (true) {
            if (countOnlyByThisNumber == 0 || countOnlyByThisNumber == nextDigit) {
                if (currentDigit == nextDigit) {
                    countDigit++;
                } else {
                    currentDigit = nextDigit;
                    countDigit = 1;
                }
                if (countDigit == countLimit)
                    return currentDigit;
            }
            nextDigit = getTheCurrentNumber(localNumber);
            localNumber = shiftToNextNumber(localNumber);
            if (localNumber == 0 && nextDigit == 0)
                break;
        }

        return -1;
    }

    public static long getTheCurrentNumber(long number) {
        return number % 10;
    }

    public static long shiftToNextNumber(long number) {
        return number / 10;
    }
}
