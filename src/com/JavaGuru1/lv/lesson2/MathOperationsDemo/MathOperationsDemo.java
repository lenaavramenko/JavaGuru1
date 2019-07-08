package lv.javaguru.day2.MathOperationsDemo;

import java.util.Scanner;

public class MathOperationsDemo {
    public static void main(String[] args) {
        System.out.println("Welcome to the 'Math Operations'!");
        System.out.println();

        int a = 100, b = 45;
        int sum = a + b;

        System.out.println("1) Addition '+':");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a + b = " + a + " + " + b + " = " + sum);

        System.out.println();
        System.out.println("--------------------------------------");

        System.out.println("2) Subtraction '-':");
        long x = 40, y = 18;
        long difference = x - y;

        System.out.println("x = " + x + ", y = " + y);
        System.out.println("x - y = " + x + " - " + y + " = " + difference);

        System.out.println();
        System.out.println("--------------------------------------");

        System.out.println("3) Division '/':");
        short m = 15, n = 3;

        System.out.println("m = " + m + ", n = " + n);
        System.out.println("m / n = " + m + " / " + n + " = " + m / n);

        System.out.println();
        System.out.println("***************************************");

        System.out.println("4) Modulo '%' with your values:");
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the values!");
        System.out.print("First value 'c': ");
        double c = input.nextDouble();
        System.out.print("Second value 'd': ");
        double d = input.nextDouble();

        double res = c % d;

        System.out.println("c % d = " + c + " % " + d + " = " + res);
        System.out.println("***************************************");
    }

}
