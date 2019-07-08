package com.JavaGuru1.lv.lesson4.sign;

public class SignComparator {

    public String compare(int number) {
        String ans;
        if (number > 0) {
            ans = "Number is positive";
        } else if (number < 0) {
            ans = "Number is negative";
        } else {
            ans = "Number is equal to zero";
        }
        System.out.println(number + " : " + ans);
        return ans;
    }
}
