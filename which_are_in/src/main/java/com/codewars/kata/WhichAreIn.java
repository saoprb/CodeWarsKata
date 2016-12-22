package com.codewars.kata;

/**
 * Created by saoprb on 12/22/16.
 */
public class WhichAreIn {
    public static String[] inArray(String[] a, String[] b) {
        java.util.HashSet<String> matched = new java.util.HashSet<String>();
        for (String key : a) {
            for (String word : b) {
                if (word.contains(key)) {
                    matched.add(key);
                }
            }
        }
        java.util.ArrayList<String> sortedMatched = new java.util.ArrayList<String>(matched);
        java.util.Collections.sort(sortedMatched, new java.util.Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        return sortedMatched.toArray(a);
    }

    public static String[] inArrayLambda(String[] a, String[] b) {
        java.util.ArrayList<String> listA = new java.util.ArrayList<>(java.util.Arrays.asList(a));

        class WordGroup {
            String[] group;
            public WordGroup(String[] group) {
                this.group = group;
            }
            public boolean contains(String key) {
                for (String candidate : group) {
                    if (candidate.contains(key))
                        return true;
                }
                return false;
            }
        }

        WordGroup group = new WordGroup(b);

        return listA.stream().filter(key -> group.contains(key)).distinct().sorted().toArray(String[]::new);
    }

    public static String[] inArrayLambda2(String[] a, String[] b) {
        java.util.ArrayList<String> listA = new java.util.ArrayList<>(java.util.Arrays.asList(a));
        java.util.ArrayList<String> listB = new java.util.ArrayList<>(java.util.Arrays.asList(b));

        return listA.stream().filter(p -> listB.stream().anyMatch(q -> q.contains(p))).distinct().sorted().toArray(String[]::new);
    }
}
