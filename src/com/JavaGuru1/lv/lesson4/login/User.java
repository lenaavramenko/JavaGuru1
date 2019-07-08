package com.JavaGuru1.lv.lesson4.login;

public class User {
    String user;
    String password;
    boolean isBlocked;
    short countLog;

    public User(String user, String password) {
        this.user = user;
        this.password = password;
        this.countLog = 2;
        this.isBlocked = false;
    }

    public short clearLog() {
        this.countLog = 2;
        return this.countLog;
    }

    public boolean setBlocked() {
        isBlocked = true;
        System.out.println("USER IS BLOCKED!!!");
        return true;
    }
}
