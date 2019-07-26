package com.JavaGuru1.lv.lesson9.wordVocabulary;

public class UniqueWordVocabularyDemo{
    public static void main(String[] args) {
        UniqueWordVocabulary voc = new UniqueWordVocabulary();

        voc.getWordsCount();

        voc.addWord("Apple");
        voc.addWord("Frog");
        voc.addWord("Cat");
        voc.addWord("Life");
        voc.addWord("");
        voc.addWord("");
        voc.addWord("Apple");
        voc.addWord("Apple");
        voc.addWord("Apple");
        voc.addWord("");

        voc.printVocabulary();

        voc.getWordsCount();
    }

}
