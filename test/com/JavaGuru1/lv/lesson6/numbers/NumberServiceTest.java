package com.JavaGuru1.lv.lesson6.numbers;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberServiceTest {

    @Test
    public void rangeSumTest(){
        NumberService victim = new NumberService();
        victim.rangeSum(3, 7);
        assertEquals(25, victim.res);

        victim.rangeSum(7, 3);
        assertEquals(25, victim.res);
    }

    @Test
    public void rangeEvenCountTest(){
        NumberService victim = new NumberService();
        victim.rangeEvenCount(3, 7);
        assertEquals(10, victim.res2);

        victim.rangeEvenCount(7, 3);
        assertEquals(10, victim.res2);
    }

}