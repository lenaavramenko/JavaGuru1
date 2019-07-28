package com.JavaGuru1.lv.lesson7.palindrome;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    @Test
    public void isPalindromeTest(){
        boolean victim = Palindrome.isPalindrome("ghghg");
        assertEquals(true, victim);
    }

}