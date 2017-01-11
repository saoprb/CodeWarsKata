package com.codewars.kata;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by saoprb on 1/5/17.
 */
public class EmirpsTest {

    @Test
    public void givenInput10WhenFindEmirpThen0_0_0() {
        assertArrayEquals(new long[]{0,0,0}, Emirps.findEmirp(10));
    }

    @Test
    public void givenIntput50WhenFindEmirpThen4_37_98() {
        assertArrayEquals(new long[]{4,37,98}, Emirps.findEmirp(50));
    }

    @Test
    public void givenInput100WhenFindEmirpThen8_97_418() {
        assertArrayEquals(new long[]{8,97,418}, Emirps.findEmirp(100));
    }

    @Test
    public void givenInput200WhenFindEmirpThen15_199_1489() {
        assertArrayEquals(new long[]{15,199,1489}, Emirps.findEmirp(200));
    }

    @Test
    public void givenInput389WhenFindEmirpThen20_389_3232() {
        assertArrayEquals(new long[]{20,389,3232}, Emirps.findEmirp(389));
    }

    @Test
    public void givenInput14957WhenFindEmirpThen446_14957_3661772() {
        assertArrayEquals(new long[]{446,14957,3661772}, Emirps.findEmirp(14957));
    }

    @Test
    public void givenInput1979WhenFindEmirpThen96_1979_103268() {
        assertArrayEquals(new long[]{96,1979,103268}, Emirps.findEmirp(1979));
    }

    @Test
    public void givenInput359WhenIsPrimeThenTrue() {
        Emirps.generatePrimesBasedOnEratosthenes(359);
        assertTrue(Emirps.isPrime(359));
    }

    @Test
    public void givenInput1979WhenIsPrimeThenTrue() {
        Emirps.generatePrimesBasedOnEratosthenes(1979);
        assertTrue(Emirps.isPrime(1979));
    }

    @Test
    public void givenInput14957WhenIsPrimeThenTrue() {
        Emirps.generatePrimesBasedOnEratosthenes(14957);
        assertTrue(Emirps.isPrime(14957));
    }

    @Test
    public void givenInput19WhenIsPrimeThenTrue() {
        assertTrue(Emirps.isPrime(19));
    }

    @Test
    public void generateSegmentedPrimesBasedOnEratosthenes() {
        Emirps.generatePrimesBasedOnEratosthenes(40);
        Emirps.generatePrimesBasedOnEratosthenes(50);
    }
}
