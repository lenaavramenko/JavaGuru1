package com.JavaGuru1.lv.lesson8.mathOperations;

public class SubtractionOperation implements MathOperation{
    private double sub;
    @Override
    public double compute(double a, double b) {
        return sub = a*b;
    }
}
