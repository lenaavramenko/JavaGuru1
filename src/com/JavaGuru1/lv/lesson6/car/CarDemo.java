package com.JavaGuru1.lv.lesson6.car;

public class CarDemo {
    public static void main(String[] args) {

        Car car = new Car("AUDI", "black", 280);

        car.accelerate(180);
        System.out.println(car.toString());

        car.decelerate(30);
        System.out.println(car.toString());

        System.out.println(car.isDriving());
        System.out.println(car.isStopped());
        System.out.println(car.getCurrentSpeed());

        car.accelerate(70);
        System.out.println(car.getCurrentSpeed());

        car.decelerate(50);
        System.out.println(car.toString());

        car.decelerate(0);
        System.out.println(car.isDriving());
        System.out.println(car.isStopped());
        System.out.println(car.getCurrentSpeed());
    }
}
