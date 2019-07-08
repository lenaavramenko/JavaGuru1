package com.JavaGuru1.lv.lesson3.encoder;

public class Encoder {

    public void encode(short code) {
        System.out.println(code + " => \'" + (char)code + "\'");
    }

    public void decode(char symbol) {
        System.out.println("\'" + symbol + "\' => " + (short)symbol);
    }
}
