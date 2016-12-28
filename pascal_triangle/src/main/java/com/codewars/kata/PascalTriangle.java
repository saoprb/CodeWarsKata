package com.codewars.kata;


/**
 * Created by saoprb on 12/27/16.
 */
public class PascalTriangle {

    public static int[][] pascal(int depth) {
        return pascal(depth, new int[1], null, 1, 0, new int[depth][]);
    }

    public static int[][] pascal(int depth, int[] thisLevel, int[] previousLevel, int currentLevel, int currentIndex, int[][] pascalTree) {
        addToPascalTreeAtNewLevelStart(thisLevel, currentLevel, currentIndex, pascalTree);
        setValueInBetweenByAddingLeftAndRightParents(thisLevel, previousLevel, currentIndex);
        setValueAtBothEndsToOne(thisLevel, currentIndex);
        if (currentIndex < thisLevel.length) {
            return setTheNextPascalValue(depth, thisLevel, previousLevel, currentLevel, currentIndex, pascalTree);
        } else if (currentLevel < depth) {
            return addPascalLevel (depth, thisLevel, currentLevel, pascalTree);
        } else {
            return pascalTree;
        }
    }

    public static void addToPascalTreeAtNewLevelStart(int[] thisLevel, int currentLevel, int currentIndex, int[][] pascalTree) {
        if (currentIndex == 0) {
            pascalTree[currentLevel-1] = thisLevel;
        }
    }

    public static void setValueInBetweenByAddingLeftAndRightParents(int[] thisLevel, int[] previousLevel, int currentIndex) {
        if (previousLevel != null && currentIndex < thisLevel.length-1 && currentIndex > 0) {
            thisLevel[currentIndex] = previousLevel[currentIndex - 1] + previousLevel[currentIndex];
        }
    }

    public static void setValueAtBothEndsToOne(int[] thisLevel, int currentIndex) {
        if (currentIndex == 0 || currentIndex == thisLevel.length-1) {
            thisLevel[currentIndex] = 1;
        }
    }

    public static int[][] setTheNextPascalValue(int depth, int[] thisLevel, int[] previousLevel, int currentLevel, int currentIndex, int[][] pascalTree) {
        return pascal(depth, thisLevel, previousLevel, currentLevel, ++currentIndex, pascalTree);
    }

    public static int[][] addPascalLevel(int depth, int[] previousLevel, int currentLevel, int[][] pascalTree) {
        currentLevel++;
        return pascal(depth, new int[currentLevel], previousLevel, currentLevel, 0, pascalTree);
    }

    public static int[][] pascal2(int depth) {
        java.util.List<int[]> pascalArray = new java.util.ArrayList<int[]>();
        int[] previousLevelArray = null;

        for (int level = 0; level < depth; level++) {
            int levelSize = level + 1;
            int[] levelArray = new int[levelSize];
            pascalArray.add(levelArray);

            levelArray[0] = 1;
            levelArray[levelArray.length-1] = 1;
            if (previousLevelArray != null) {
                for (int levelIndex = 1; levelIndex < levelArray.length-1; levelIndex++) {
                    levelArray[levelIndex] = previousLevelArray[levelIndex-1] + previousLevelArray[levelIndex];
                }
            }

            previousLevelArray = levelArray;
        }

        return pascalArray.toArray(new int[1][1]);
    }

    public static int[][] pascal1(int depth) {
        java.util.List<int[]> pascalArray = new java.util.ArrayList<int[]>();

        for (int level = 0; level < depth; level++) {
            int levelSize = level + 1;
            int[] levelArray = new int[levelSize];
            pascalArray.add(levelArray);
        }

        int[] previousLevelArray = null;

        for (int[] levelArray : pascalArray) {
            levelArray[0] = 1;
            levelArray[levelArray.length-1] = 1;
            if (previousLevelArray != null) {
                for (int levelIndex = 1; levelIndex < levelArray.length-1; levelIndex++) {
                    levelArray[levelIndex] = previousLevelArray[levelIndex-1] + previousLevelArray[levelIndex];
                }
            }
            previousLevelArray = levelArray;
        }

        return pascalArray.toArray(new int[1][1]);
    }
}
