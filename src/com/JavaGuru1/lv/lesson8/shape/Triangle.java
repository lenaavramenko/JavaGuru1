package com.JavaGuru1.lv.lesson8.shape;

public class Triangle extends AbstractShape {

    private int sideA;
    private int sideB;

    public Triangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public String getName() {
        this.name = "Triangle 90";
        return super.getName();
    }

    @Override
    public double getArea() {
        this.area = (sideA * sideB) / 2;
        return super.getArea();
    }
}
