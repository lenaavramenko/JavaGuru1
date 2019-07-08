package com.JavaGuru1.lv.lesson8.animals;

import java.util.Objects;

public class Cat extends Mammal {
    private String voice;

    public Cat(String name, int age, String fur, String color) {
        super(name, age, fur, color);
        this.voice = "Miu-miu!";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return Objects.equals(voice, cat.voice);
    }

    @Override
    public String toString() {
        return "Cat [ My name is " + name +
                "! I'm - " + age +
                " years old, and I have a beautiful " + fur +
                " " + color +
                " fur!] - " + voice;
    }

}
