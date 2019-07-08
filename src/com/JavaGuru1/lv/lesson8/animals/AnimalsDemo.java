package com.JavaGuru1.lv.lesson8.animals;

public class AnimalsDemo {

    public static void main(String[] args) {
        Animal animal = new Animal("Fox", 3);
        Mammal mammal = new Mammal("Voofy", 5, "long", "white");
        Bird bird = new Bird("Glory", 14);
        Cat cat = new Cat("Vasja", 4, "long", "grey");
        Dog dog = new Dog("Ruby", 2, "short", "black");

        System.out.println(animal);
        animal.distance(6);

        System.out.println(mammal);
        mammal.distance(10);

        System.out.println(bird);
        bird.distance(15);

        System.out.println(cat);
        System.out.println(dog);
        dog.sleep();
    }
}
