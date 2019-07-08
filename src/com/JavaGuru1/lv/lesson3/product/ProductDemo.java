package com.JavaGuru1.lv.lesson3.product;

public class ProductDemo {
    public static void main(String[] args) {

        Product prod1 = new Product("Milk");
        prod1.regularPrice = 0.8;
        prod1.discount = 20;

        Product prod2 = new Product("Cola");
        prod2.regularPrice = 1.20;
        prod2.discount = 15.5;

        Product prod3 = new Product("Apple");
        prod3.regularPrice = 3.45;
        prod3.discount = 5;

        prod1.printInformation();
        prod2.printInformation();
        prod3.printInformation();
    }
}
