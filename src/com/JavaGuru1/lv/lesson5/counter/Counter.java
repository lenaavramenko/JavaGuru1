package com.JavaGuru1.lv.lesson5.counter;

public class Counter {

    private int value;
    private int step;

    public Counter() {
        this.value = 0;
        this.step = 1;
    }

    public void increment() {
        if ((value + step) < 100) {
            value = value + step;
        }
    }

    public void decrement() {
        if ((value - step) > 0) {
            value = value - step;
        }
    }

    public void reset() {
        this.value = 0;
        this.step = 1;
    }

    public void setValue(int newValue) {
        if (newValue >= 0 && newValue <= 100) {
            value = newValue;
        }
    }

    public int getValue() {
        return this.value;
    }

    public void setStep(int newStep) {
        if (newStep >= 1 && newStep <= 10) {
            step = newStep;
        }
    }

    public int getStep() {
        return this.step;
    }

}