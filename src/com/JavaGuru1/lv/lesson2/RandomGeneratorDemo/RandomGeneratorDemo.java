package lv.javaguru.day2.RandomGeneratorDemo;

import java.util.Random;

public class RandomGeneratorDemo {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int random1 = randomGenerator.nextInt(10);
        int random2 = randomGenerator.nextInt();
        int random3 = randomGenerator.nextInt(60);

        System.out.println("A = " + random1);
        System.out.println("B = " + random2);
        System.out.println("C = " + random3);
        System.out.println("Sum = " + random1 + " + " + random2 + " + " + random3 + " = " + (random1 + random2 + random3));
    }
}
