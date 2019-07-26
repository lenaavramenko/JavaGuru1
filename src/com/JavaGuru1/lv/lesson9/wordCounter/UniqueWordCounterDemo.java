package com.JavaGuru1.lv.lesson9.wordCounter;

public class UniqueWordCounterDemo {
    public static void main(String[] args) {
        UniqueWordCounter wordCounter = new UniqueWordCounter();

        wordCounter.addWord("apple");
        wordCounter.addWord("mouse");
        wordCounter.addWord("apple");
        wordCounter.addWord("apple");
        wordCounter.addWord("mouse");
        wordCounter.addWord("mouse");
        wordCounter.addWord("mouse");
        wordCounter.addWord("mouse");
        wordCounter.addWord("mouse");
        wordCounter.addWord("apple");
        wordCounter.addWord("apple");
        wordCounter.addWord("apple");
        wordCounter.addWord("apple");
        wordCounter.addWord("apple");
        wordCounter.addWord("ball");
        wordCounter.addWord("apple");
        wordCounter.addWord("apple");
        wordCounter.addWord("apple");
        wordCounter.addWord("apple");
        wordCounter.addWord("apple");
        wordCounter.printWordsFrequency();
        wordCounter.getMostFrequentWord();

    }
}
