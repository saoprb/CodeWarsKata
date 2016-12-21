package com.codewars.kata;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by saoprb on 12/20/16.
 */
public class PerfectSquareTest {
    @Test
    public void test01() {
        assertFalse(PerfectSquare.isSquare(-1)); // => false
        assertFalse(PerfectSquare.isSquare( 3)); // => false
        assertTrue(PerfectSquare.isSquare( 4)); // => true
        assertTrue(PerfectSquare.isSquare(25)); // => true
        assertFalse(PerfectSquare.isSquare(26)); // => false
    }

    @Test
    public void shouldWorkForRandomSquareNumbers() throws Exception {
        Random rand = new Random();
        for(int i = 0; i < 100; ++i){
            int randomNum = rand.nextInt(0x0fff);
            int randomSq = randomNum * randomNum;
            assertEquals(String.format("%d is a square number", randomSq), true, PerfectSquare.isSquare(randomSq));
        }
    }

    @Test
    public void test81878502() {
        assertEquals(String.format("%d is a square number", 81878502), false, PerfectSquare.isSquare(81878502));
    }
}
