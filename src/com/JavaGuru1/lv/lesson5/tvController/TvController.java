package com.JavaGuru1.lv.lesson5.tvController;

public class TvController {

    private Tv tv;

    public TvController(){
        tv = new Tv();
    }

    public void setTv(){
        tv.isOn();
        tv.getCurrentChanel();
        tv.getCurrentVolume();
        tv.setManufacturer("Sony");
    }

    public void nextChanel(){
        tv.nextChanel();
    }

    public void prevChanel() {
        tv.prevChanel();
    }

    public void volumeUp() {
        tv.volumeUp();
    }

    public void volumeDown() {
        tv.volumeDown();
    }

    public void printTv(){
        System.out.println(tv.toString());
    }
}

