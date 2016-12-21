package com.codewars.kata;

import org.junit.Test;

import java.util.Random;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

/**
 * Created by saoprb on 12/20/16.
 */
public class TripleDoubleTest {
    @Test
    public void test1(){
        assertThat(1, is(equalTo((TripleDouble.kata(451999277L, 41177722899L)))));
    }

    @Test
    public void test2(){
        assertThat(0, is(equalTo((TripleDouble.kata(1222345L, 12345L)))));
    }

    @Test
    public void test3(){
        assertEquals(0, TripleDouble.kata(12345L, 12345L));
    }
    @Test
    public void test4(){
        assertEquals(1, TripleDouble.kata(666789L, 12345667L));
    }
    @Test
    public void test5(){
        assertEquals(1, TripleDouble.kata(10560002L, 100L));
    }
    public static void RandomTest(){
        Random rn = new Random();
        long n1=10L+rn.nextInt(1000000000);
        long n2=10L+rn.nextInt(1000000000);
        assertEquals(Sol(n1,n2), TripleDouble.kata(n1,n2));
    }

    private static int Sol(long num1, long num2){
        String s1=Long.toString(num1);
        String s2=Long.toString(num2);
        int c=0;
        char tmp=s2.charAt(0);
        for(int i=1;i<s2.length();i++){
            if(s2.charAt(i)==tmp){
                for(int j=0;j<s1.length()-2;j++){
                    if(s1.charAt(j)==tmp && s1.charAt(j)==s1.charAt(j+1)&&s1.charAt(j+2)==tmp) return 1;
                }
            } else tmp=s2.charAt(i);
        }
        return 0;
    }
}
