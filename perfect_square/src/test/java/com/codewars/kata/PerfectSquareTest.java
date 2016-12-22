package com.codewars.kata;

import org.junit.Test;

import java.util.Random;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by saoprb on 12/20/16.
 */
public class PerfectSquareTest {
    @Test
    public void test01() {
        assertThat(PerfectSquare.isSquare(-1),is(false));
        assertThat(PerfectSquare.isSquare(3),is(false));
        assertThat(PerfectSquare.isSquare(4),is(true));
        assertThat(PerfectSquare.isSquare(25),is(true));
        assertThat(PerfectSquare.isSquare(26),is(false));
    }

    @Test
    public void shouldWorkForRandomSquareNumbers() throws Exception {
        Random rand = new Random();
        for(int i = 0; i < 100; ++i){
            int randomNum = rand.nextInt(0x0fff);
            int randomSq = randomNum * randomNum;
            assertThat(String.format("%d is a square number", randomSq), PerfectSquare.isSquare(randomSq), is(true));
        }
    }

    @Test
    public void test81878502() {
        assertThat(String.format("%d is a square number", 81878502), PerfectSquare.isSquare(81878502), is(false));
    }
}
