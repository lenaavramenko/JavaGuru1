package com.JavaGuru1.lv.lesson7.sort;

public class ArrayServiceDemo {
    public static void main(String[] args) {

        int[] arr = ArrayService.create(5);

        ArrayService.fillRandomly(arr);
        ArrayService.printArray(arr);
        ArrayService.sort(arr);
        ArrayService.printArray(arr);
        ArrayService.swap(arr);
        ArrayService.printArray(arr);
        ArrayService.sum(arr);
        ArrayService.avg(arr);
    }
}
