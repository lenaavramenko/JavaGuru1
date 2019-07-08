package com.JavaGuru1.lv.lesson4.colorDetector;

import java.util.Scanner;

public class LightColorDetectorDemo {
    public static void main(String[] args) {

        LightColorDetector l1 = new LightColorDetector();
        System.out.println("The Color is: " + l1.detect(680));
        System.out.println("The Color is: " + l1.detect(3));
        System.out.println("The Color is: " + l1.detect(389));
        System.out.println("The Color is: " + l1.detect(548));
        System.out.println("The Color is: " + l1.detect(620));
    }
}
