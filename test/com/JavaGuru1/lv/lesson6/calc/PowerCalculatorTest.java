package com.JavaGuru1.lv.lesson6.calc;

import org.junit.Test;

import static org.junit.Assert.*;

public class PowerCalculatorTest {

    @Test
    public void powerTest(){
        PowerCalculator victim = new PowerCalculator();
        assertEquals(25, victim.power(5, 2));
    }

    @Test
    public void powerWithNegativeNumbersTest(){
        PowerCalculator victim = new PowerCalculator();
        assertEquals(1, victim.power(-5, -2));
    }
}