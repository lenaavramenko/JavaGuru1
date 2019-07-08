package com.JavaGuru1.lv.lesson8.animals;

import java.util.Objects;

public class Mammal extends Animal {

    protected String fur;
    protected String color;

    public Mammal(String name, int age, String fur, String color) {
        super(name, age);
        this.fur = fur;
        this.color = color;
    }

    @Override
    public void distance(int km) {
        System.out.println("I'm running: " + km + " km");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mammal)) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return Objects.equals(fur, mammal.fur) &&
                Objects.equals(color, mammal.color);
    }

    @Override
    public String toString() {
        return "Mammal [ My name is " + name +
                "! I'm - " + age +
                " years old, and I have a beautiful " + fur +
                " " + color +
                " fur!]";
    }
}
