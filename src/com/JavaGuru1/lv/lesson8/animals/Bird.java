package com.JavaGuru1.lv.lesson8.animals;

public class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public void distance(int km) {
        System.out.println("I'm flying: " + km + " km");
    }
}
