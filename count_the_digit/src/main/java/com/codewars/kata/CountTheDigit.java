package com.codewars.kata;

/**
 * Created by saoprb on 12/20/16.
 */
public class CountTheDigit {
    public static int nbDig(int n, int d) {
        int dd = 0;
        String dAsString = Integer.valueOf(d).toString();
        for (int k = 0; k <= n; k++) {
            Integer kk = k*k;
            String kkAsString = kk.toString();
            for (int pos = 0; pos < kkAsString.length(); pos++) {
                if (dAsString.equals(String.valueOf(kkAsString.charAt(pos))))
                    dd++;
            }
        }
        return dd;
    }

    public static void main(String[] args) {
        System.out.println(nbDig(10, 1));

    }
}
