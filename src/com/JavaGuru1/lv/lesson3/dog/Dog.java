package com.JavaGuru1.lv.lesson3.dog;

public class Dog {

    public int age;
    public String color;
    public String name;

    public Dog() {

    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name, String color) {
        this.name = name;
        this.color= color;
    }

    public void voice() {
        System.out.println("Woof, woof! My name is " + name + ", I am " + age + " years old.");
    }

    public void eat() {
        System.out.println("Feat me! - " + name + ", my color is: " + color);
    }

    public void sleep() {
        System.out.println(name + ": Zzzzzzzzzz...");

    }
}
