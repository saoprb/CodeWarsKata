package com.codewars.kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by saoprb on 12/21/16.
 */
public class TriangleTest {
    @Test
    public void test_Two_Should_Be_Three() throws Exception {
        assertEquals(3, Triangle.triangular(2));
    }

    @Test
    public void test_Four_Should_Be_Ten() throws Exception {
        assertEquals(10, Triangle.triangular(4));
    }

    @Test
    public void test_Four_Should_Be_Negative() throws Exception {
        assertEquals(0, Triangle.triangular(-4));
    }
}