package com.JavaGuru1.lv.lesson8.shape;

public class Square extends AbstractShape {

    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public String getName() {
        this.name = "Square";
        return super.getName();
    }

    @Override
    public double getArea() {
        this.area = side * side;
        return super.getArea();
    }
}
