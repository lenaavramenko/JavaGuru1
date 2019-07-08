package com.JavaGuru1.lv.lesson3.human;

public class HumanDemo {
    public static void main(String[] args) {

        Human h1 = new Human("Kolja", 23);
        Human h2 = new Human("Vasilij", 20);
        Human h3 = new Human("Olga", 28);
        Human h4 = new Human("Maria", 18);
        Human h5 = new Human("Viktor", 34);
        Human h6 = new Human("Denis", 40);

        h1.greet();
        h2.greet();
        h3.greet();
        h4.greet();
        h5.greet();
        h6.greet();
    }
}
