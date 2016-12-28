package com.codewars.kata;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by saoprb on 12/27/16.
 */
public class PascalTriangleTest {
    @Test
    public void testDepth01() {
        assertArrayEquals( "Depth 1 should return [ [1] ]",
                new int[][] { {1} },
                PascalTriangle.pascal(1));
    }

    @Test
    public void testDepth02() {
        assertArrayEquals( "Depth 2 should return [ [1], [1][1] ]",
                new int[][] { {1}, {1,1} },
                PascalTriangle.pascal(2));
    }

    @Test
    public void testDepth03() {
        assertArrayEquals( "Depth 3 should return [ [1], [1][1], [1][2][1] ]",
                new int[][] { {1}, {1,1}, {1,2,1} },
                PascalTriangle.pascal(3));
    }

    @Test
    public void testDepth05() {
        assertArrayEquals("Depth 5 should return [ [1], [1,1], [1,2,1], [1,3,3,1], [1,4,6,4,1] ]",
                new int[][] { {1}, {1,1}, {1,2,1}, {1,3,3,1}, {1,4,6,4,1} },
                PascalTriangle.pascal(5));
    }
}
