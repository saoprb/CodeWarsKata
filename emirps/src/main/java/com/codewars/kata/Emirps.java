package com.codewars.kata;

/**
 * Created by saoprb on 1/5/17.
 */
public class Emirps {

    private static final int segmentSize = 100;
    private static long largestCachedPrime = 2;
    private static long segmentTotal = 1;
    private static boolean[][] primesTable = null;

    public static long[] findEmirp(long limit) {
        long[] result = new long[]{0,0,0};

        for (long testPrime = 13; testPrime <= limit; testPrime++) {
            if (!isPrimeCached(testPrime)) {
                continue;
            }
            String testEmirp = Long.toString(testPrime);
            String testReversEmirp = new StringBuilder().append(testEmirp).reverse().toString();
            if (testEmirp.equals(testReversEmirp)) {
                continue;
            }
            long reversed = Long.parseLong(testReversEmirp);
            if (!isPrimeCached(reversed)) {
                continue;
            }
            result[0]++;
            result[1] = testPrime;
            result[2] += testPrime;
        }

        return result;
    }


    public static void generatePrimesBasedOnEratosthenes(long limitPrime) {
        segmentTotal = limitPrime/segmentSize + 1;
        primesTable = new boolean[(int)segmentTotal][];

        for (int i = 0; i < segmentTotal; i++) {
            primesTable[i] = new boolean[segmentSize];
            for (int j = 0; j < segmentSize; j++) {
                primesTable[i][j] = true;
            }
        }

        for (long leftFactor = 2; leftFactor <= Math.sqrt(limitPrime); leftFactor++) {
            if (isPrime(leftFactor)) {
                for (long rightFactor = leftFactor; rightFactor < limitPrime; rightFactor++) {
                    long index = leftFactor*rightFactor - 2;
                    if (index <= limitPrime) {
                        int x = (int) index / segmentSize;
                        int y = (int) index % segmentSize;
                        primesTable[x][y] = false;
                    }
                }
            }
        }

        largestCachedPrime = limitPrime;
    }

    public static boolean isPrimeCached(long testPrime) {
        if (testPrime > largestCachedPrime) {
            generatePrimesBasedOnEratosthenes(testPrime);
        }

        return isPrime(testPrime);
    }

    public static boolean isPrime(long testPrime) {
        long index = testPrime - 2;
        int x = (int) index / segmentSize;
        int y = (int) index % segmentSize;

            if (primesTable[x][y]) {
            return true;
        }

        return false;
    }
}
