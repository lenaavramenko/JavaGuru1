package com.JavaGuru1.lv.lesson4.login;

public class UserLoginServiceTest {
    public static void main(String[] args) {
        UserLoginServiceTest testRunner = new UserLoginServiceTest();
        testRunner.test1();
    }

    private void test1() {
        UserLoginService victim = new UserLoginService();
        User user = new User("username", "1234");
        String password = "1234";
        boolean expectedResult = true;
        boolean actualResult = victim.login(user, password);
        check(expectedResult, actualResult, "test1");
    }

    public void check(boolean actualResult, boolean expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed!");
            System.out.println("Expected " + expectedResult + " but was " + actualResult);
        }
    }

}
