package com.JavaGuru1.lv.lesson3.human;

public class Human {
    public String name;
    public int age;

    public Human() {
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void greet() {
        System.out.println("Hello! My name is " + name + ", and I am " + age + " years old.");
        System.out.println("==================================================");
    }
}
