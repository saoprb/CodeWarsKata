package com.codewars.kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by saoprb on 12/20/16.
 */
public class CountTheDigitTest {
    private static void testing(int actual, int expected) {
        assertEquals(expected, actual);
    }
    private static int randInt(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1));
    }
    private static int nbDigSol(int n, int d) {
        int k = 0, cnt = 0;
        char c = String.valueOf(d).charAt(0);
        while (k <= n) {
            int a = 0;
            String s = String.valueOf(k*k);
            for(int i = 0; i < s.length(); i++)
                if(s.charAt(i) == c)
                    a++;
            if (a > 0) {
                cnt += a;
            }
            k++;
        }
        return cnt;
    }

    @Test
    public void test() {
        System.out.println("Fixed Tests nbDig");
        testing(CountTheDigit.nbDig(5750, 0), 4700);
        testing(CountTheDigit.nbDig(11011, 2), 9481);
        testing(CountTheDigit.nbDig(12224, 8), 7733);
        testing(CountTheDigit.nbDig(11549, 1), 11905);
        testing(CountTheDigit.nbDig(14550, 7), 8014);
        testing(CountTheDigit.nbDig(8304, 7), 3927);
        testing(CountTheDigit.nbDig(10576, 9), 7860);
        testing(CountTheDigit.nbDig(12526, 1), 13558);
        testing(CountTheDigit.nbDig(7856, 4), 7132);
        testing(CountTheDigit.nbDig(14956, 1), 17267);
    }
    @Test
    public void test1() {
        System.out.println("100 Random Tests");
        for (int i = 0; i < 100; i++) {
            int n = randInt(2000, 15000);
            int d = randInt(0, 9);
            int r = nbDigSol(n, d);
            //System.out.println("n " + n + " d " + d + " --> " + r);
            //System.out.println("****");
            testing(CountTheDigit.nbDig(n, d), r);
        }
    }
}
