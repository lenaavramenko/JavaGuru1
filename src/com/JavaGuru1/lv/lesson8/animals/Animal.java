package com.JavaGuru1.lv.lesson8.animals;

import java.util.Objects;

public class Animal {

    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sleep() {
        System.out.println("Zzz.. Zzz..");
    }

    public void distance(int km) {
        System.out.println(km + " km");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return age == animal.age &&
                Objects.equals(name, animal.name);
    }

    @Override
    public String toString() {
        return "Animal [ My name is " + name +
                "! I'm = " + age +
                " years old.]";
    }
}
