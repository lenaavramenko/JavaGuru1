package com.JavaGuru1.lv.lesson7.array;

public class ArrayServiceDemo {
    public static void main(String[] args) {

        int[] arr = ArrayService.create(8);

        ArrayService.fillRandomly(arr);
        ArrayService.printArray(arr);
        ArrayService.sum(arr);
        ArrayService.avg(arr);
    }
}
