package com.codewars.kata;

import java.lang.reflect.Array;

/**
 * Created by saoprb on 12/20/16.
 */
public class EqualSides {
    public static int findEvenIndex(int[] arr) {
        int equalSideIndex = -1;

        for (int currentIndex = 0; currentIndex < Array.getLength(arr); currentIndex++) {
            if (getLeftSum(arr, currentIndex) == getRightSum(arr, currentIndex)) {
                equalSideIndex = currentIndex;
            }
        }

        return equalSideIndex;
    }

    public static int getLeftSum(int[] arr, int boundary) {
        int sum = 0;
        for (int currentPosition = 0; currentPosition < boundary; currentPosition++) {
            sum += arr[currentPosition];
        }
        return sum;
    }

    public static int getRightSum(int[] arr, int boundary) {
        int sum = 0;
        for (int currentPosition = boundary + 1; currentPosition < Array.getLength(arr); currentPosition++) {
            sum += arr[currentPosition];
        }
        return sum;
    }
}
