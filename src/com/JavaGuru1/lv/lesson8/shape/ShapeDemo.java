package com.JavaGuru1.lv.lesson8.shape;

public class ShapeDemo {
    public static void main(String[] args) {
        
        Circle circle = new Circle("white", 23);
        circle.getName();
        circle.getArea();
        circle.getColor();
        System.out.println();

        Square square = new Square("black", 10);
        square.getName();
        square.getArea();
        square.getColor();
        System.out.println();

        Triangle triangle = new Triangle("black", 10, 20);
        triangle.getName();
        triangle.getArea();
        triangle.getColor();
        System.out.println();

/*        Shape[] shapes = new Shape[5];
​
        shape[0] = new Square("white", 6);
        shape[1] = new Circle("black",8);
​
        for (Shape shape : shapes) {
            System.out.println(shape.getName() + " : " + shape.getArea());
        }*/
    }
}
