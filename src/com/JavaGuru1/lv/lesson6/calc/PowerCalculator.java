package com.JavaGuru1.lv.lesson6.calc;

public class PowerCalculator {

    public int power(int number, int power) {
        int result = 1;
        if (number > 0 && power > 0) {
            for (int i = 1; i <= power; i++) {
                result = result * number;
                System.out.println(result);
            }
        } else {
            System.out.println("Please try with positive numbers! =)");
        }
        return result;
    }
}

