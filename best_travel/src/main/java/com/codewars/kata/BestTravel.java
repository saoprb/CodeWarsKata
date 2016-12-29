package com.codewars.kata;

/**
 * Created by saoprb on 12/28/16.
 */
public class BestTravel {
    public static Integer chooseBestSum(int t, int k, java.util.List<Integer> ls) {
        if (ls.size() < k) {
            return null;
        }

        Integer bestDistance = chooseBestSum(t, k, ls, 0, 0, 0, new java.util.HashSet<>());
        if (bestDistance == 0) {
            return null;
        }

        return bestDistance;

//        int bestDistance = 0;
//
//        for (int travel1 = 0; travel1 < ls.size(); travel1++) {
//            int newDistance1 = ls.get(travel1);
//            if (newDistance1 > bestDistance && newDistance1 <= t) {
//                bestDistance = newDistance1;
//            }
//            for (int travel2 = 0; travel2 < ls.size(); travel2++) {
//                if (travel2 == travel1) {
//                    continue;
//                }
//                int newDistance2 = newDistance1 + ls.get(travel2);
//                if (newDistance2 > bestDistance && newDistance2 <= t) {
//                    bestDistance = newDistance2;
//                }
//                for (int travel3 = 0; travel3 < ls.size(); travel3++) {
//                    if (travel3 == travel1 || travel3 == travel2) {
//                        continue;
//                    }
//                    int newDistance3 = newDistance2 + ls.get(travel3);
//                    if (newDistance3 > bestDistance && newDistance3 <= t) {
//                        bestDistance = newDistance3;
//                    }
//                }
//            }
//        }
//
//        if (bestDistance == 0) {
//            return null;
//        }
//
//        return bestDistance;
    }

    public static Integer chooseBestSum(int distanceLimit, int travelLimit, java.util.List<Integer> listDistances, int travelCount, int bestDistance, int accumulatedDistance, java.util.Set<Integer> markedTravels) {
        if (travelCount < travelLimit) {
            for (int travel = 0; travel < listDistances.size(); travel++) {
                if (markedTravels.contains(travel)) {
                    continue;
                }
                markedTravels.add(travel);
                int newDistance = accumulatedDistance + listDistances.get(travel);
                if (newDistance > bestDistance && newDistance <= distanceLimit) {
                    bestDistance = newDistance;
                }
                bestDistance = chooseBestSum(distanceLimit, travelLimit, listDistances, travelCount + 1, bestDistance, newDistance, markedTravels);
                markedTravels.remove(travel);
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
