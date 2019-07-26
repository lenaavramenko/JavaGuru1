package com.JavaGuru1.lv.lesson7.sort;

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
            System.out.println();
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

    public static void sort(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void swap(int[] array) {
        int temp = 0;
        int length = array.length;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[length - i - 1];
            array[length - i - 1] = temp;
        }
    }

}
