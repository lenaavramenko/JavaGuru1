package com.JavaGuru1.lv.lesson4.login;

public class UserLoginService {

    public boolean login(User user, String password) {

        if (password.equals(user.password)) {
            user.clearLog();
            user.isBlocked = false;
            return true;
        } else if (user.countLog > 0) {
            user.countLog--;
            return false;
        }
        user.setBlocked();
        return false;

    }

}
