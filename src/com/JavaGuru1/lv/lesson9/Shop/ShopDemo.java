package com.JavaGuru1.lv.lesson9.Shop;

import java.math.BigDecimal;

public class ShopDemo {
    public static void main(String[] args) {

        Product prod1 = new Product("cheese", new BigDecimal("1.52"));
        Product prod2 = new Product("bred", new BigDecimal("2.55"));
        Product prod3 = new Product("milk", new BigDecimal("1.08"));
        Product prod4 = new Product("juice", new BigDecimal("0.89"));
        Product prod5 = new Product("fresh", new BigDecimal("2.00"));

        Shop shop = new Shop();

        shop.add(prod1);
        shop.add(prod2);
        shop.add(prod3);
        shop.add(prod4);
        shop.add(prod5);

        shop.printAll();
        System.out.println();

        shop.removeProductByName("fresh");
        shop.printAll();
        System.out.println();

        shop.findProductByName("milk");
    }
}
