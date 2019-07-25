package com.JavaGuru1.lv.lesson7.array;

import java.util.Random;

public class ArrayService {

    public static int[] create(int size) {
        return new int[size];
    }

    public static void fillRandomly(int[] array) {
        if (array.length != 0) {
            Random random = new Random();
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(101);
            }
        }
    }

    public static void printArray(int[] array) {
        if (array.length != 0) {
            for (int i : array) {
                System.out.println(i);
            }
        }
    }

    public static int sum(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i : array)
            sum += i;
        System.out.println("SUM of array: " + sum);
        return sum;
    }

    public static int avg(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int avg = sum(array) / array.length;
        System.out.println("Average of array: " + avg);
        return avg;
    }

}
