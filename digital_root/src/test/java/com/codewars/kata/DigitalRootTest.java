package com.codewars.kata;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;

/**
 * Created by saoprb on 12/20/16.
 */
public class DigitalRootTest {

    /*
rootIs(493193)
=> 4 + 9 + 3 + 1 + 9 + 3
=> 29 ...
=> 2 + 9
=> 11 ...
=> 1 + 1
=> 2
     */
    @Test
    public void testDigitalRoot_493193() {
        Integer value = Integer.valueOf(DigitalRoot.rootIs(493193));
        assertThat("The digital root of 493193 is ", value, is(equalTo(2)));
    }

    @Test
    public void Tests() {
        assertEquals( "Nope!" , DigitalRoot.rootIs(16), 7);
        assertEquals( "Nope!" , DigitalRoot.rootIs(195), 6);
        assertEquals( "Nope!" , DigitalRoot.rootIs(992), 2);
        assertEquals( "Nope!" , DigitalRoot.rootIs(99999999), 9);
        assertEquals( "Nope!" , DigitalRoot.rootIs(167346), 9);
        assertEquals( "Nope! Should work for 0" , DigitalRoot.rootIs(0), 0);
    }
}
