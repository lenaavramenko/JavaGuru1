package com.JavaGuru1.lv.lesson4.stock;

public class StockDemo {
    public static void main(String[] args) {
        Stock google = new Stock("GOOGLE", 20.56);
        google.printInformation();

        google.updatePrice(65.98);
        google.updatePrice(45.56);
        google.printInformation();

        google.updatePrice(10.32);
        google.updatePrice(5.09);
        google.printInformation();

        google.updatePrice(14.34);
        google.updatePrice(90.99);
        google.printInformation();
    }
}
