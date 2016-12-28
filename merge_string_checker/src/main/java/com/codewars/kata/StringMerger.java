package com.codewars.kata;

import java.awt.*;

/**
 * Created by saoprb on 12/28/16.
 */
public class StringMerger {
    public static boolean isMerge(String s, String part1, String part2) {
        if (s.isEmpty() && part1.isEmpty() && part2.isEmpty()) {
            return true;
        }
        if (s.isEmpty()) {
            return false;
        }
        return isMerge(new StringBuffer(), s, part1, part2, 0, 0, 0).equals(s);
    }

    public static String isMerge(StringBuffer merged, String s, String part1, String part2, int i, int j, int k) {
        for (; i < s.length(); i++) {
            if (j < part1.length() && k < part2.length()) {
                if (s.charAt(i) == part1.charAt(j) && s.charAt(i) == part2.charAt(k)) {
                    String merge1 = isMerge(new StringBuffer().append(merged.toString()).append(part1.charAt(j)), s, part1, part2, i+1, j+1, k);
                    String merge2 = isMerge(new StringBuffer().append(merged.toString()).append(part2.charAt(k)), s, part1, part2, i+1, j, k+1);
                    if (merge1.toString().equals(s)) {
                        return merge1.toString();
                    } else if (merge2.toString().equals(s)) {
                        return merge2.toString();
                    } else {
                        return "";
                    }
                }
            }
            if (j < part1.length()) {
                if (s.charAt(i) == part1.charAt(j)) {
                    merged.append(part1.charAt(j));
                    j++;
                }
            }
            if (k < part2.length()) {
                if (s.charAt(i) == part2.charAt(k)) {
                    merged.append(part2.charAt(k));
                    k++;
                }
            }
        }
        for (; j < part1.length(); j++) {
            merged.append(part1.charAt(j));
        }
        for (; k < part2.length(); k++) {
            merged.append(part2.charAt(k));
        }
        return merged.toString();
    }
}
