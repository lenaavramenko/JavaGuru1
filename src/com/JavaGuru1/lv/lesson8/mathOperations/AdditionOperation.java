package com.JavaGuru1.lv.lesson8.mathOperations;

public class AdditionOperation implements MathOperation {
    private double sum;
    @Override
    public double compute(double a, double b) {
        return sum = a+b;
    }
}
