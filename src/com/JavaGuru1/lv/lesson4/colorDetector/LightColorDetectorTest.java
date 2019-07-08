package com.JavaGuru1.lv.lesson4.colorDetector;


public class LightColorDetectorTest {

    public static void main(String[] args) {
        LightColorDetectorTest testRunner = new LightColorDetectorTest();
        testRunner.test1();
        testRunner.test2();
        testRunner.test3();
        testRunner.test4();
        testRunner.test5();
        testRunner.test6();
        testRunner.test7();
    }

    private void test1() {
        LightColorDetector victim = new LightColorDetector();
        int wavelength = 3;
        String expectedResult = "Invisible Light";
        String actualResult = victim.detect(wavelength);
        check(expectedResult, actualResult, "test1");
    }

    private void test2() {
        LightColorDetector victim = new LightColorDetector();
        int wavelength = 382;
        String expectedResult = "Violet";
        String actualResult = victim.detect(wavelength);
        check(expectedResult, actualResult, "test2");
    }

    private void test3() {
        LightColorDetector victim = new LightColorDetector();
        int wavelength = 480;
        String expectedResult = "Blue";
        String actualResult = victim.detect(wavelength);
        check(expectedResult, actualResult, "test3");
    }

    private void test4() {
        LightColorDetector victim = new LightColorDetector();
        int wavelength = 520;
        String expectedResult = "Green";
        String actualResult = victim.detect(wavelength);
        check(expectedResult, actualResult, "test4");
    }

    private void test5() {
        LightColorDetector victim = new LightColorDetector();
        int wavelength = 575;
        String expectedResult = "Yellow";
        String actualResult = victim.detect(wavelength);
        check(expectedResult, actualResult, "test5");
    }

    private void test6() {
        LightColorDetector victim = new LightColorDetector();
        int wavelength = 602;
        String expectedResult = "Orange";
        String actualResult = victim.detect(wavelength);
        check(expectedResult, actualResult, "test6");
    }

    private void test7() {
        LightColorDetector victim = new LightColorDetector();
        int wavelength = 735;
        String expectedResult = "Red";
        String actualResult = victim.detect(wavelength);
        check(expectedResult, actualResult, "test7");
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
