package com.JavaGuru1.lv.lesson8.animals;

public class Parrot extends Bird {
    private String voice;
    
    public Parrot(String name, int age, String feathers, String voice) {
        super(name, age, feathers);
        this.voice = voice;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public String toString() {
        return "Parrot [ My name is " + name +
                "! I'm = " + age +
                " years old, and I have a bright " + feathers +
                " feathers!] - " + voice;
    }
}

