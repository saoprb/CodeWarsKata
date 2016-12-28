package com.codewars.kata;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by saoprb on 12/28/16.
 */
public class StringMergerTest {
    @Test
    public void normalHappyFlow() {
        assertTrue("codewars can be created from code and wars", StringMerger.isMerge("codewars", "code", "wars"));
        assertTrue("codewars can be created from cdwr and oeas", StringMerger.isMerge("codewars", "cdwr", "oeas"));
        assertFalse("Codewars are not codwars", StringMerger.isMerge("codewars", "cod", "wars"));
    }

    @Test
    public void someRandomCases() {
        assertTrue("Can we merge it? Yes, we can!' is a merge of 'Ca w me Ye, can' and 'nerge it?swe !",
                StringMerger.isMerge("Can we merge it? Yes, we can!", "Ca w me Ye, can", "nerge it?swe !"));

    }

    @Test
    public void handleBananas() {
        assertTrue("Can we handle banananas' is a merge of 'bana' and 'nanas",
                StringMerger.isMerge("banananas", "bana", "nanas"));

    }

    @Test
    public void handleCodewarss() {
        assertFalse("Codewars is not codewarss' is a merge of 'codewars' and 's",
                StringMerger.isMerge("codewars", "code", "warss"));
    }
}
