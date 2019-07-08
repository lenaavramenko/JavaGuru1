package com.JavaGuru1.lv.lesson8.animals;

public class Animal {
    public String name;
    public int age;
    public int distance;
    private String family;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        this.distance = 0;
    }

    public int run(int km) {
        distance = distance + km;
        return distance;
    }

    public void greeting() {
        System.out.println("Hi! I'm a - " + name + ".");
    }
}
