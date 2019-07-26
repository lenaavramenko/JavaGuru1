package com.JavaGuru1.lv.lesson9.wordCounter;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class UniqueWordCounter {

    private Map<String, Integer> words = new HashMap<>();

    public UniqueWordCounter() {
    }

    public void addWord(String word) {
        if (word != null && words.containsKey(word)) {
            words.put(word, words.get(word) + 1);
        } else if (word != null) {
            words.put(word, 1);
        }
    }

    public int getMostFrequentWord() {
        String keyMaxVal = "";
        int maxValueInMap = (Collections.max(words.values()));
        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            if (entry.getValue() == maxValueInMap) {
                keyMaxVal = entry.getKey();
            }
        }
        System.out.println("The most frequent word is: \"" + keyMaxVal + "\"");
        return maxValueInMap;
    }

    public void printWordsFrequency() {
        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
