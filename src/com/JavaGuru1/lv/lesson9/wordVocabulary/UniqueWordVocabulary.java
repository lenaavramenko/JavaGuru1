package com.JavaGuru1.lv.lesson9.wordVocabulary;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordVocabulary {

    private Set<String> vocabulary = new HashSet<>();
    private String word;

    public void addWord(String word) {
        if (!(word.isEmpty())){
            vocabulary.add(word);
        }
    }

    public int getWordsCount() {
        int count = vocabulary.size();
        System.out.println(count);
        return count;
    }

    public void printVocabulary() {
        for (String uniq: vocabulary) {
            System.out.println(uniq);
        }
    }
}
