package com.JavaGuru1.lv.lesson7.palindrome;

public class Palindrome {

    public static boolean isPalindrome(String text) {

        char[] charArray = text.toLowerCase().replaceAll("[\\W]", " ").toCharArray();
        for (int i = 0; i < text.length(); i++) {
            if (charArray[i] != charArray[(text.length() - 1) - i]) {
                return false;
            }
        }
        return true;
    }
}