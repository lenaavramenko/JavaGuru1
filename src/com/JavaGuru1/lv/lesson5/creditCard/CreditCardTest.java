package com.JavaGuru1.lv.lesson5.creditCard;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {

    private CreditCard target;

    @Before
    public void setUp() {
        target = new CreditCard("6467041946153399", "1234");
    }

    @Test
    public void incorrectPinTest() {
        target.deposit(300, "3232");
        assertEquals("1234", target.getPin());
    }

    @Test
    public void depositTest() {
        target.deposit(300, "1234");
        assertEquals(300, target.getBalance());
    }

    @Test
    public void withdrawTest() {
        target.withdraw(300, "1234");
        assertEquals(0, target.getBalance());
    }
}
