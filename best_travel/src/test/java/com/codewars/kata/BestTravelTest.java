package com.codewars.kata;

import java.util.*;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by saoprb on 12/28/16.
 */
public class BestTravelTest {
    @Test
    public void BasicTests1() {
        System.out.println("****** Basic Tests small numbers******");
        List<Integer> ts = new ArrayList<>(Arrays.asList(50, 55, 56, 57, 58));
        int n = BestTravel.chooseBestSum(163, 3, ts);
        assertEquals(163, n);
        ts = new ArrayList<>(Arrays.asList(50));
        Integer m = BestTravel.chooseBestSum(163, 3, ts);
        assertEquals(null, m);
        ts = new ArrayList<>(Arrays.asList(91, 74, 73, 85, 73, 81, 87));
        n = BestTravel.chooseBestSum(230, 3, ts);
        assertEquals(228, n);
    }

    @Test
    public void randomTest() {
        Random random = new Random();

        for (int test = 0; test < 10; test++) {
            int distanceRandom = random.nextInt(10);

            while (distanceRandom <= 0) {
                distanceRandom = random.nextInt(10);
            }

            int travelLimit = random.nextInt(distanceRandom);

            int distanceLimit = random.nextInt(200);
            List<Integer> distanceList = new ArrayList<>();
            for (int data = 0; data < distanceRandom; data++) {
                distanceList.add(Math.abs(random.nextInt(distanceLimit)));
            }

            Integer expected = 0;
            Set<Integer> marked = new HashSet<>();

            for (int sample = 0; sample < travelLimit; sample++) {
                Integer sampleIndex = random.nextInt(distanceRandom - 1);
                if (marked.contains(sampleIndex)) {
                    continue;
                }
                expected += distanceList.get(sampleIndex);
                marked.add(sampleIndex);
            }

            if (expected == 0) {
                System.out.format("assertNull(BestTravel.chooseBestSum(%s, %s, %s));", expected, expected, travelLimit, distanceList);
                assertNull(BestTravel.chooseBestSum(expected, travelLimit, distanceList));
                System.out.println();
            } else {
                System.out.format("assertEquals(%s, BestTravel.chooseBestSum(%s, %s, %s));", expected, expected, travelLimit, distanceList);
                assertEquals(expected, BestTravel.chooseBestSum(expected, travelLimit, distanceList));
                System.out.println();
            }
        }
    }
}
