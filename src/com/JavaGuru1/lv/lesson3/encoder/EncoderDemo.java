package com.JavaGuru1.lv.lesson3.encoder;

public class EncoderDemo {
    public static void main(String[] args) {

        Encoder encoder1 = new Encoder();
        encoder1.encode((short) 65);

        Encoder encoder2 = new Encoder();
        encoder2.decode('F');
    }
}
