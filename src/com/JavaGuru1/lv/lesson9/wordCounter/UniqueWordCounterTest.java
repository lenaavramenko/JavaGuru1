package com.JavaGuru1.lv.lesson9.wordCounter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniqueWordCounterTest {

    @Test
    public void getMostFrequentWord() {
        UniqueWordCounter victim = new UniqueWordCounter();
        victim.addWord("Apple");
        victim.addWord("Apple");
        victim.addWord("Apple");
        victim.addWord("Ice");
        victim.addWord("Ice");

        assertEquals(3, victim.getMostFrequentWord());
    }

}