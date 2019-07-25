package com.JavaGuru1.lv.lesson6.numbers;

public class NumberService {

    public int res;
    public int res2;

    public int rangeSum(int start, int finish) {
        if (start < finish) {
            for (int i = start; i <= finish; i++) {
                res += i;
            }
        } else {
            for (int i = finish; i >= start; i--) {
                res -= i;
                System.out.print(i);
            }
        }
        System.out.println("SUM from " + start + " to " + finish + " = " + res);
        return res;
    }

    public int rangeEvenCount(int start, int finish) {
        if (start <= finish) {
            for (int i = start; i <= finish; i++) {
                if (i % 2 == 0) {
                    res2 += i;
                }
            }
        } else {
            for (int i = finish; i >= start; i--) {
                if (i % 2 == 0) {
                    res2 -= i;
                    System.out.print(i + " + ");
                }
            }
        }
        System.out.println("SUM from " + start + " to " + finish + " = " + res2);
        return res2;
    }
}

