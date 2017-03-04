package com.codewars.kata;

/**
 * Created by saoprb on 12/28/16.
 */
public class BestTravel {

    public static Integer chooseBestSum(int t, int k, java.util.List<Integer> ls) {
        if (ls.size() < k) {
            return null;
        }

        Integer bestDistance = chooseBestSum1(t, k, ls);

        if (bestDistance == 0) {
            return null;
        }

        return bestDistance;
    }

    private static Integer chooseBestSum1(int distanceLimit, int travelLimit, java.util.List<Integer> listDistances) {
        int bestDistance = -1;

        for (int travel = 0; travel < listDistances.size(); travel++) {
            int newDistance = listDistances.get(travel);

            if (newDistance <= distanceLimit) {
                if (travelLimit == 1) {
                    bestDistance = Math.max(bestDistance, newDistance);
                } else {
                    Integer temp = chooseBestSum(distanceLimit - newDistance, travelLimit - 1, listDistances.subList(travel + 1, listDistances.size()));
                }
            }

        }

        return bestDistance;
    }

//    public static Integer chooseBestSum(int t, int k, List<Integer> ls) {
//        return ls.size() < k ? null : chooseBestSum(t, k, ls, 0, 0, 0, 0);
//    }
//
//    public static Integer chooseBestSum(int distanceLimit, int townsLimit, List<Integer> setDistances, int currentDistancesCount, Integer bestDistance, Integer currentDistance, int travelStart) {
//        if (currentDistancesCount < townsLimit) {
//            for (int travelled = travelStart; travelled < setDistances.size(); travelled++) {
//                Integer newDistance = currentDistance + setDistances.get(travelled);
//
//                if (newDistance > bestDistance && newDistance <= distanceLimit) {
//                    bestDistance = newDistance;
//                }
//
//                bestDistance = chooseBestSum(distanceLimit, townsLimit, setDistances, currentDistancesCount + 1, bestDistance, newDistance, travelled + 1);
//            }
//        }
//        return bestDistance;
//    }

//        public static Integer chooseBestSum(int t, int k, java.util.List<Integer> ls) {
//            return ls.size() < k ? null : chooseBestSum(t, k, ls, new java.util.ArrayList<>(), new java.util.ArrayList<>(), 0, 0, 0);
//        }
//
//        public static Integer chooseBestSum(int distanceLimit, int townsLimit, java.util.List<Integer> setDistances, java.util.List<Integer> bestDistances, java.util.List<Integer> currentDistances, Integer bestDistance, Integer currentDistance, int travelStart) {
//            if (currentDistances.size() < townsLimit) {
//                for (int travelled = travelStart; travelled < setDistances.size(); travelled++) {
//                    int newDistance = currentDistance + setDistances.get(travelled);
//
//                    if (newDistance > bestDistance && newDistance <= distanceLimit) {
//                        bestDistance = newDistance;
//
//                        if (bestDistances.size() == townsLimit) {
//                            bestDistances.remove(townsLimit-1);
//                        }
//                        bestDistances.add(setDistances.get(travelled));
//                    }
//
//                    currentDistances.add(setDistances.get(travelled));
//                    bestDistance = chooseBestSum(distanceLimit,townsLimit, setDistances, bestDistances, currentDistances, bestDistance, newDistance, travelled + 1);
//                    currentDistances.remove(currentDistances.size() - 1);
//                }
//            }
//            return currentDistances.size() == 0 && bestDistances.size() != townsLimit ? null : bestDistance;
//        }

//    public static Integer chooseBestSum(int t, int k, java.util.List<Integer> ls) {
//        return ls.size() < k ? null : chooseBestSum(t, k, ls, new java.util.ArrayList<>(), new java.util.ArrayList<>(), 0, 0);
//    }
//
//    public static int chooseBestSum(int distanceLimit, int townsLimit, java.util.List<Integer> setDistances, java.util.List<Integer> bestDistances, java.util.List<Integer> currentDistances, int bestDistance, int currentDistance) {
//        if (currentDistances.size() < townsLimit) {
//            java.util.List<Integer> newSetDistances = new java.util.ArrayList<>();
//            for (int travelled = 0; travelled < setDistances.size(); travelled++) {
//                if (setDistances.get(travelled) == -1) {
//                    continue;
//                }
//                newSetDistances.clear();
//                newSetDistances.addAll(setDistances);
//                newSetDistances.set(travelled, -1);
//
//                int newDistance = currentDistance + setDistances.get(travelled);
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
//                bestDistance = chooseBestSum(distanceLimit, townsLimit, newSetDistances, bestDistances, currentDistances, bestDistance, newDistance);
//                currentDistances.remove(currentDistances.size()-1);
//            }
//        }
//
//        if (currentDistances.size() == 0) {
//            return bestDistances.size() != townsLimit ? null : bestDistance;
//        }
//        return bestDistance;
//    }
}
