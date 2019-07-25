package com.JavaGuru1.lv.lesson5.tvController;

public class TvControllerDemo {
    public static void main(String[] args) {

        TvController contr = new TvController();

        contr.setTv();

        contr.nextChanel();
        contr.nextChanel();
        contr.nextChanel();
        contr.nextChanel();
        contr.volumeUp();
        contr.volumeUp();
        contr.volumeUp();
        contr.volumeUp();
        contr.volumeUp();
        contr.printTv();

        contr.prevChanel();
        contr.volumeDown();
        contr.printTv();

    }
}
