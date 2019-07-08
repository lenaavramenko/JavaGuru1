package com.JavaGuru1.lv.lesson4.stock;

public class StockTest {
    public static void main(String[] args) {
        StockTest testRunner = new StockTest();
        testRunner.test1();
    }

    private void test1() {
        Stock victim = new Stock("KFC", 10);
        double newPrice = 40;
        double expectedResult = 40;
        double actualResult = victim.updatePrice(newPrice);
        if (victim.maxPrice == expectedResult) ;
        check(expectedResult, actualResult, "test1");
        check(expectedResult, actualResult, "test1");
    }

    public void check(double actualResult, double expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed!");
            System.out.println("Expected " + expectedResult + " but was " + actualResult);
        }
    }
}
