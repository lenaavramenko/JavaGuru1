package com.JavaGuru1.lv.lesson10.user;

public class UserValidationDemo {
    public static void main(String[] args) {

        UserValidationService validationService = new UserValidationService();
        User user = new User("Nata", "Fush", 222);

        validationService.validate(user);
    }
}
