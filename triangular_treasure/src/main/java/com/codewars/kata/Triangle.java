package com.codewars.kata;

import java.util.stream.Stream;

/**
 * Created by saoprb on 12/21/16.
 */
public class Triangle {
    public static int triangular(int base) {
        if (base < 0) return 0;
        return Stream.iterate(0, i -> i + 1).limit(base + 1).reduce(0, (a, b) -> a + b);
//        int sum = 0;
//        for (int i = 0; i <= base; i++) {
//            sum += i;
//        }
//        return sum;
    }
}
