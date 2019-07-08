package com.JavaGuru1.lv.lesson5.tv;

public class TvDemo {
    public static void main(String[] args) {
        Tv tv = new Tv();
        tv.setOn();
        tv.setManufacturer("SONY");
        tv.setCurrentChanel(12);
        tv.setCurrentVolume(6);
        System.out.println(tv.toString());

        tv.volumeUp();
        tv.prevChanel();

        System.out.println(tv.toString());

        tv.nextChanel();
        tv.volumeDown();
        System.out.println(tv.toString());

        tv.setOff();
        tv.nextChanel();
        tv.nextChanel();
        tv.nextChanel();
        System.out.println(tv.toString());
    }
}
