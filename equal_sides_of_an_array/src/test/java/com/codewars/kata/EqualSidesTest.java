package com.codewars.kata;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by saoprb on 12/20/16.
 */
public class EqualSidesTest {
    @Test
    public void test() {
        assertThat(EqualSides.findEvenIndex(new int[] {1,2,3,4,3,2,1}), is(equalTo(3)));
        assertThat(EqualSides.findEvenIndex(new int[] {1,100,50,-51,1,1}), is(equalTo(1)));
        assertThat(EqualSides.findEvenIndex(new int[] {1,2,3,4,5,6}), is(equalTo(-1)));
        assertThat(EqualSides.findEvenIndex(new int[] {20,10,30,10,10,15,35}), is(equalTo(3)));
        assertThat(EqualSides.findEvenIndex(new int[] {-8505, -5130, 1926, -9026}), is(equalTo(-1)));
        assertThat(EqualSides.findEvenIndex(new int[] {2824, 1774, -1490, -9084, -9696, 23094}), is(equalTo(1)));
        assertThat(EqualSides.findEvenIndex(new int[] {4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4}), is(equalTo(6)));
    }
}
