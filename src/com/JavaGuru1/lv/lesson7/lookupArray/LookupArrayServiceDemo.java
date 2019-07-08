package com.JavaGuru1.lv.lesson7.lookupArray;

public class LookupArrayServiceDemo {
    public static void main(String[] args) {
        LookupArrayService arr = new LookupArrayService();

        System.out.println("array: " + arr.findMax(new int[]{1,2,3,4,56,7}));
        System.out.println("array: " + arr.findMin(new int[]{1,2,3,4,56,7}));
        System.out.println("array null: " + arr.findMax(new int[]{}));
    }
}
