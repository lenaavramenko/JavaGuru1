package com.JavaGuru1.lv.lesson5.book;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    @Test
    public void getTitle() {
        Book victim = new Book();
        victim.setTitle("Moby");
        assertEquals("Moby", victim.getTitle());
    }

}