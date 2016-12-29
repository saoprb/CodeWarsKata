package com.codewars.kata;

import java.util.*;

/**
 * Created by saoprb on 12/28/16.
 */
public class BestTravel {
    public static Integer chooseBestSum(int t, int k, List<Integer> ls) {
        return ls.size() < k ? null : chooseBestSum(t, k, ls, 0, 0, 0, 0);
    }

    public static Integer chooseBestSum(int distanceLimit, int townsLimit, List<Integer> setDistances, int currentDistancesCount, int bestDistance, int currentDistance, int travelStart) {
        if (currentDistancesCount < townsLimit) {
            for (int travelled = travelStart; travelled < setDistances.size(); travelled++) {
                int newDistance = currentDistance + setDistances.get(travelled);

                if (newDistance > bestDistance && newDistance <= distanceLimit) {
                    bestDistance = newDistance;
                }

                bestDistance = chooseBestSum(distanceLimit,townsLimit, setDistances, currentDistancesCount + 1, bestDistance, newDistance, travelled + 1);
            }
        }
        return bestDistance;
    }

//    public static Integer chooseBestSum(int t, int k, List<Integer> ls) {
//        return ls.size() < k ? null : chooseBestSum(t, k, ls, new ArrayList<>(), new ArrayList<>(), 0, 0, 0);
//    }
//
//    public static int chooseBestSum(int distanceLimit, int townsLimit, List<Integer> setDistances, List<Integer> bestDistances, List<Integer> currentDistances, int bestDistance, int currentDistance, int travelStart) {
//        if (currentDistances.size() < townsLimit) {
//            for (int travelled = travelStart; travelled < setDistances.size(); travelled++) {
//                int newDistance = currentDistance + setDistances.get(travelled);
//
//                if (newDistance > bestDistance && newDistance <= distanceLimit) {
//                    bestDistance = newDistance;
//
//                    if (bestDistances.size() == townsLimit) {
//                        bestDistances.remove(townsLimit-1);
//                    }
//                    bestDistances.add(setDistances.get(travelled));
//                }
//
//                currentDistances.add(setDistances.get(travelled));
//                bestDistance = chooseBestSum(distanceLimit,townsLimit, setDistances, bestDistances, currentDistances, bestDistance, newDistance, travelled + 1);
//                currentDistances.remove(currentDistances.size() - 1);
//            }
//        }
//        return currentDistances.size() == 0 && bestDistances.size() != townsLimit ? null : bestDistance;
//    }

//    public static int chooseBestSum(int distanceLimit, int townsLimit, List<Integer> setDistances, List<Integer> bestDistances, List<Integer> currentDistances, int bestDistance, int currentDistance) {
//        if (currentDistances.size()< townsLimit) {
//            List<Integer> newSetDistances = new ArrayList<Integer>();
//            for (int travelled = 0; travelled < setDistances.size(); travelled++) {
//                newSetDistances.clear();
//                newSetDistances.addAll(setDistances);
//                newSetDistances.set(travelled, 0);
//
//                int newDistance = currentDistance + setDistances.get(travelled);
//
//                if (newDistance > bestDistance && newDistance <= distanceLimit) {
//                    bestDistance = newDistance;
//                    if (bestDistances.size() == townsLimit) {
//                        bestDistances.remove(townsLimit-1);
//                    }
//                    bestDistances.add(setDistances.get(travelled));
//                }
//
//                if (currentDistances.size() == townsLimit) {
//                    currentDistances.remove(townsLimit-1);
//                }
//                currentDistances.add(setDistances.get(travelled));
//
//                bestDistance = chooseBestSum(distanceLimit, townsLimit, newSetDistances, bestDistances, currentDistances, bestDistance, currentDistance);
//
//                currentDistances.remove(currentDistances.size()-1);
//            }
//        }
//
//        return bestDistance;
//    }
}
