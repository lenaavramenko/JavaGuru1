package com.JavaGuru1.lv.lesson3.product;

public class Product {
    public String name;
    public double regularPrice;
    public double discount;

    public Product(String name){
        this.name = name;
    }

    public double actualPrice() {
        return regularPrice - discount*regularPrice/100;
    }

    public void printInformation() {
        System.out.println(
                "Product : name = \"" + name
                + "\", regular price = " + regularPrice
                + " EUR, discount = " + (int)discount
                + "%, actual price = " + actualPrice() + " EUR"
        );
    }
}
