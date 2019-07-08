package com.JavaGuru1.lv.lesson3.dog;

public class DogDemo {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Bonja";

        Dog dog2 = new Dog("Zhunja", "Three-color");
        dog2.age = 3;

        Dog dog3 = new Dog("Lucky", 4);

        System.out.println(dog1.name);
        System.out.println(dog2.name);
        System.out.println("Dog2: " + dog2.name + ", age: " + dog2.age + ", color: " + dog2.color);
        System.out.println("Dog3: " + dog3.name + ", age: " + dog3.age);

        dog3.voice();
        dog2.eat();
        dog1.sleep();

    }
}
