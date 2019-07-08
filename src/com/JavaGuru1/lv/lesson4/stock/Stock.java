package com.JavaGuru1.lv.lesson4.stock;

public class Stock {

    String nameCom;
    double actualPrice;
    double minPrice;
    double maxPrice;

    public Stock(String nameCom, double actualPrice) {
        this.nameCom = nameCom;
        this.actualPrice = actualPrice;
        this.maxPrice = actualPrice;
        this.minPrice = actualPrice;
    }

    public double updatePrice(double newPrice) {
        actualPrice = newPrice;
        if (actualPrice < minPrice) {
            minPrice = actualPrice;
        } else if (actualPrice > maxPrice) {
            maxPrice = actualPrice;
        }
        return actualPrice;
    }

    public void printInformation() {
        System.out.println("Company = \"" + nameCom
                + "\", Current Price = "+ actualPrice
                + ", Min Price = " + minPrice
                + ", Max Price = " + maxPrice
        );
    }
}

