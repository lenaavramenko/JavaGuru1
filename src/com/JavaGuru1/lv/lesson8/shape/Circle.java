package com.JavaGuru1.lv.lesson8.shape;

public class Circle extends AbstractShape {
    
    private int radius;
    
    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public String getName() {
        this.name = "circle";
        return super.getName();
    }

    @Override
    public double getArea() {
        this.area = 3.14 * radius * radius;
        return super.getArea();
    }
}
