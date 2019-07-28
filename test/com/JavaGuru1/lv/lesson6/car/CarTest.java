package com.JavaGuru1.lv.lesson6.car;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    @Test
    public void accelerateTest(){
        Car victim = new Car("BMW", "green", 200);
        victim.accelerate(70);
        assertEquals(70, victim.getCurrentSpeed());

    }

    @Test
    public void notAccelerateTest(){
        Car victim = new Car("BMW", "green", 200);
        victim.accelerate(70);
        victim.accelerate(30);
        assertEquals(70, victim.getCurrentSpeed());

    }

    @Test
    public void decelerateTest(){
        Car victim = new Car("BMW", "green", 200);
        victim.accelerate(70);
        victim.decelerate(30);
        assertEquals(30, victim.getCurrentSpeed());

    }

    @Test
    public void notDecelerateTest(){
        Car victim = new Car("BMW", "green", 200);
        victim.decelerate(70);
        assertEquals(0, victim.getCurrentSpeed());

    }

}