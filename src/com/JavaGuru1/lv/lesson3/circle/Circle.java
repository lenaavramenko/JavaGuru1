package com.JavaGuru1.lv.lesson3.circle;

public class Circle {

    public double radius;

    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }

    public double calculateArea(){
        double area = Math.PI * (radius * radius);
        return area;
    }
}
