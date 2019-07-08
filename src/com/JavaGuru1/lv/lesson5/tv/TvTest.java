package com.JavaGuru1.lv.lesson5.tv;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TvTest {

    @Test
    public void nextChannel(){
        Tv victim = new Tv();
        victim.setOff();
        victim.nextChanel();
        assertEquals(0, victim.getCurrentChanel());

        victim.setOn();
        victim.nextChanel();
        assertEquals(1, victim.getCurrentChanel());
    }

    @Test
    public void prevChannel(){
        Tv victim = new Tv();
        victim.setOff();
        victim.setCurrentChanel(4);
        victim.prevChanel();
        assertEquals(4, victim.getCurrentChanel());

        victim.setOn();
        victim.nextChanel();
        assertEquals(1, victim.getCurrentChanel());

        victim.setCurrentChanel(0);
        victim.prevChanel();
        assertEquals(0, victim.getCurrentChanel());
    }
}