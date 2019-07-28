package com.JavaGuru1.lv.lesson9.Shop;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;


public class Shop {

    private Map<String, Product> productRepo = new HashMap<>();

    public Product add(Product product) {
        productRepo.put(product.getName(), product);
        return product;
    }

    public void findProductByName(String name) {
        System.out.println(productRepo.get(name));
    }

    public Product removeProductByName(String name) {
        return productRepo.remove(name);
    }

    public void removeAllProducts() {
        productRepo.clear();
    }

    public void printAll() {
        for (Product i : productRepo.values()) {
            System.out.println(i);
        }
    }

    public void findProduct(BigDecimal minPriceRange, BigDecimal maxPriceRange) {
        for (Product i : productRepo.values()) {
        }
    }

}
