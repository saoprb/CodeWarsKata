package com.codewars.kata;

/**
 * Created by saoprb on 12/20/16.
 */
public class DigitalRoot {
    public static int rootIs(int number, int root) {
        if (number > 0)
            return rootIs(number / 10, root + (number % 10));
        else if (root > 9)
            return rootIs(root / 10, root % 10);
        return root;
    }

    public static int rootIs(int number) {
        return rootIs(number, 0);
    }

/*
Best solutions from CodeWars
    public static int digital_root(int n) {
        while(n > 9){
            n = n/10 + n % 10;
        }
        return(n);
    }

    public static int digital_root(int n) {
        return (n != 0 && n%9 == 0) ? 9 : n % 9;
    }

    public static int digital_root(int n) {
        return (1 + (n - 1) % 9);
    }
*/
}
