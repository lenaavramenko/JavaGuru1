package com.JavaGuru1.lv.lesson3.circle;

public class CircleDemo {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        c1.radius = 15;

        Circle c2 = new Circle(4.07);

        double areaResult = c2.calculateArea();

        System.out.println("Area of Circle 1: " + c1.calculateArea() + "\n" + "Area of Circle 2: " + areaResult);

    }
}
