package com.JavaGuru1.lv.lesson9.wordVocabulary;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UniqueWordVocabularyTest {

    @Test
    public void addWord() {
        UniqueWordVocabulary victim = new UniqueWordVocabulary();
        victim.addWord("");
        victim.addWord("");
        assertEquals(0, victim.getWordsCount());
    }

    @Test
    public void getWordsCount() {
        UniqueWordVocabulary victim = new UniqueWordVocabulary();
        victim.addWord("Apple");
        victim.addWord("Apple");
        victim.addWord("Apple");
        victim.addWord("Ice");
        victim.addWord("Ice");
        assertEquals(2, victim.getWordsCount());
    }

}