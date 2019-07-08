package com.JavaGuru1.lv.lesson5.counter;

import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void setValue() {
        Counter victim = new Counter();
        victim.setValue(50);
        assertEquals(50, victim.getValue());

        victim.setValue(150);
        assertEquals(50, victim.getValue());
    }

    @Test
    public void increment() {
        Counter victim = new Counter();
        victim.setValue(50);
        victim.setStep(9);
        victim.increment();
        assertEquals(59, victim.getValue());
    }

    @Test
    public void decrement() {
        Counter victim = new Counter();
        victim.setValue(50);
        victim.setStep(5);
        victim.decrement();
        assertEquals(45, victim.getValue());
    }

    @Test
    public void getValue() {
        Counter victim = new Counter();
        assertEquals(0, victim.getValue());
    }

    @Test
    public void getStep() {
        Counter victim = new Counter();
        assertEquals(1, victim.getStep());
    }
}