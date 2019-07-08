package com.JavaGuru1.lv.lesson4.phraseAnalyser;

public class PhraseAnalyserTest {
    public static void main(String[] args) {
        PhraseAnalyserTest testRunner = new PhraseAnalyserTest();
        testRunner.test1();
        testRunner.test2();
        testRunner.test3();
    }

    public void test1() {
        PhraseAnalyser victim = new PhraseAnalyser();
        String text = "Make it better, great again";
        String expectedResult = "It stands no chance";
        String actualResult = victim.analyse(text);
        check(actualResult, expectedResult, "test1");
    }

    public void test2() {
        PhraseAnalyser victim = new PhraseAnalyser();
        String text = "But you can great again";
        String expectedResult = "It could be worse";
        String actualResult = victim.analyse(text);
        check(actualResult, expectedResult, "test2");
    }

    public void test3() {
        PhraseAnalyser victim = new PhraseAnalyser();
        String text = "Some text, like Lorem ipsum";
        String expectedResult = "It is fine, really";
        String actualResult = victim.analyse(text);
        check(actualResult, expectedResult, "test3");
    }

    public void check(String actualResult, String expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed!");
            System.out.println("Expected " + expectedResult + " but was " + actualResult);
        }
    }
}
