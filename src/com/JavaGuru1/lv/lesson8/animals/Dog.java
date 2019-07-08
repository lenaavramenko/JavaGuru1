package com.JavaGuru1.lv.lesson8.animals;

import java.util.Objects;

public class Dog extends Mammal {
    private String voice;

    public Dog(String name, int age, String fur, String color) {
        super(name, age, fur, color);
        this.voice = "Woof-woof!";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(voice, dog.voice);
    }

    @Override
    public String toString() {
        return "Dog [ My name is " + name +
                "! I'm - " + age +
                " years old, and I have a beautiful " + fur +
                " " + color +
                " fur!] - " + voice;
    }
}
