package com.JavaGuru1.lv.lesson4.login;

public class UserTest {
    public static void main(String[] args) {
        UserTest testRunner = new UserTest();
        testRunner.test1();
        testRunner.test2();
    }

    private void test1() {
        User victim = new User("username", "123");
        short expectedResult = 2;
        short actualResult = victim.clearLog();
        check1(expectedResult, actualResult, "test1");
    }

    public void check1(short actualResult, short expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed!");
            System.out.println("Expected " + expectedResult + " but was " + actualResult);
        }
    }

    private void test2() {
        User victim = new User("username", "123");
        boolean expectedResult = true;
        boolean actualResult = victim.setBlocked();
        check2(expectedResult, actualResult, "test2");
    }

    public void check2(boolean actualResult, boolean expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed!");
            System.out.println("Expected " + expectedResult + " but was " + actualResult);
        }
    }
}
