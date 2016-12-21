package com.codewars.kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by saoprb on 12/20/16.
 */
public class VasyaClerkTest {
    @Test
    public void test1() {
        assertEquals("YES", VasyaClerk.Tickets(new int[] {25, 25, 50}));
    }
    @Test
    public void test2() {
        assertEquals("NO", VasyaClerk.Tickets(new int []{25, 100}));
    }
}
