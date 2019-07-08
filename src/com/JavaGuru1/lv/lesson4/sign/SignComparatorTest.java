package com.JavaGuru1.lv.lesson4.sign;

public class SignComparatorTest {
    public static void main(String[] args) {
        SignComparatorTest testRunner = new SignComparatorTest();
        testRunner.test1();
        testRunner.test2();
        testRunner.test3();
    }

    public void test1() {
        SignComparator victim = new SignComparator();
        int number = 6;
        String expectedResult = "Number is positive";
        String actualResult = victim.compare(number);
        check(actualResult, expectedResult, "test1");
    }

    public void test2() {
        SignComparator victim = new SignComparator();
        int number = -2;
        String expectedResult = "Number is negative";
        String actualResult = victim.compare(number);
        check(actualResult, expectedResult, "test2");
    }

    public void test3() {
        SignComparator victim = new SignComparator();
        int number = 0;
        String expectedResult = "Number is equal to zero";
        String actualResult = victim.compare(number);
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
