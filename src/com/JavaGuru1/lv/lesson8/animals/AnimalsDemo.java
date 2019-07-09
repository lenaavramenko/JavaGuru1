package com.JavaGuru1.lv.lesson8.animals;

public class AnimalsDemo {

    public static void main(String[] args) {
        Animal animal = new Animal("Fox", 3);
        Mammal mammal = new Mammal("Voofy", 5, "long", "white");
        Bird bird = new Bird("Glory", 14, "green");
        Cat cat = new Cat("Vasja", 4, "long", "grey");
        Dog dog = new Dog("Ruby", 2, "short", "black");
        Parrot parrot = new Parrot("Gosha", 45, "blue", "Karrr!");

        System.out.println(animal);
        animal.distance(6);

        System.out.println(mammal);
        mammal.distance(10);

        System.out.println(bird);
        bird.distance(15);

        System.out.println(cat);
        cat.distance(2);
        
        System.out.println(dog);
        dog.sleep();

        System.out.println(parrot);
        parrot.distance(30);
    }
}
