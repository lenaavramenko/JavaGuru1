package com.JavaGuru1.lv.lesson5.creditCard;

public class CreditCard {

    private String numberCard;
    private String pin;
    private int balance;
    private int limit;
    private int debt;

    public CreditCard(String numberCard, String pin) {
        this.numberCard = numberCard;
        this.pin = pin;
        this.balance = 0;
        this.debt = 0;
    }

    public String getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(String numberCard) {
        this.numberCard = numberCard;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
        System.out.println("Now your credit limit is: " + limit);
    }

    public int getDebt() {
        return debt;
    }

    public void setDebt(int debt) {
        this.debt = debt;
    }

    public void deposit(int amount, String pin) {
        if (this.pin == pin) {
            this.balance += amount;
            System.out.println("You put: + " + amount + " EUR.");
            System.out.println("Your balance is: " + balance + " EUR.");
        } else {
            System.out.println("Your pin-code is incorrect! Please try again.");
        }
    }

    public void withdraw(int amount, String pin) {
        if (this.pin == pin) {

            if (balance > amount && amount < limit) {
                this.balance -= amount;
                System.out.println("You withdraw: - " + amount + " EUR.");
                System.out.println("Your balance is: " + balance + " EUR.");

            } else if (balance < amount && amount > limit) {
                System.out.println("Amount exceeds limit! Please change your limit.");

            } else if (balance < amount && amount < limit && debt < limit) {
                if (balance > 0){
                    this.debt = amount - balance;
                    int newLimit = limit - debt;
                    this.balance = 0;
                    System.out.println("You withdraw: - " + amount + " EUR.");
                    System.out.println("Your credit dept is: " + this.debt + " EUR, and credit limit is: " + newLimit + " EUR.");
                    System.out.println("Your balance is: " + balance + " EUR.");
                } else {
                    this.debt += amount;
                    int newLimit = limit - debt;
                    System.out.println("You withdraw: - " + amount + " EUR.");
                    System.out.println("Your credit dept is: " + debt + " EUR, and credit limit is: " + newLimit + " EUR.");
                    System.out.println("Your balance is: " + balance + " EUR.");
                }
            } else if (debt >= limit){
                System.out.println("You withdraw: - " + amount + " EUR.");
                System.out.println("Your credit is too much! " +debt);
            }

        } else {
            System.out.println("Your pin-code is incorrect! Please try again.");
        }
    }
}
