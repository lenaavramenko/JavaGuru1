package com.JavaGuru1.lv.lesson8.animals;

public class Bird extends Animal {

    protected String feathers;
    
    public Bird(String name, int age, String feathers) {
        super(name, age);
        this.feathers = feathers;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public void distance(int km) {
        System.out.println("I'm flying: " + km + " km");
    }

    @Override
    public String toString() {
        return "Bird [ My name is " + name +
                "! I'm = " + age +
                " years old, and I have a bright " + feathers +
                " feathers.]";
    }
}
