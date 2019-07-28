package com.JavaGuru1.lv.lesson8.shape;

abstract class AbstractShape implements Shape {

    public String color;
    public String name;
    public double area;

    public AbstractShape(String color) {
        this.color = color;
    }

    public String getColor() {
        System.out.println("The color of " + name + " is " + color);
        return color;
    }

    @Override
    public String getName() {
        System.out.println("This is " + name);
        return name;
    }

    @Override
    public double getArea() {
        System.out.println("The area of " + color + " " + name + " is " + area + " cm3");
        return area;
    }
}
