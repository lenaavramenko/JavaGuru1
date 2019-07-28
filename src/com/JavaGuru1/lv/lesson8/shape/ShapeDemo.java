package com.JavaGuru1.lv.lesson8.shape;

public class ShapeDemo {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];

        shapes[0] = new Square("white", 6);
        shapes[1] = new Circle("black", 8);
        shapes[2] = new Triangle("red", 6, 7);

        for (Shape shape : shapes) {
            System.out.println(shape.getName() + " : " + shape.getArea());
        }
    }
}
