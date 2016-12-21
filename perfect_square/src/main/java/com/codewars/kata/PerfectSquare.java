package com.codewars.kata;

/**
 * Created by saoprb on 12/20/16.
 */
public class PerfectSquare {
    public static boolean isSquare(int number) {
        return Math.pow(Math.floor(Math.sqrt(number)), 2) == number ? true : false;
    }

}
