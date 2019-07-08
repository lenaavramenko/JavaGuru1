package com.JavaGuru1.lv.lesson4.login;

public class UserLoginServiceDemo {

    public static void main(String[] args) {

        UserLoginService service = new UserLoginService();
        User userOne = new User("Vasja", "user-password");

        //service.login(userOne, "user-password-12345");
        //service.login(userOne, "user-password");

        System.out.println(userOne.user + " You have: "+ userOne.countLog +" try! " + service.login(userOne, "user-password-12345") +" "+ userOne.isBlocked);
        System.out.println(userOne.user + " You have: "+ userOne.countLog +" try! " + service.login(userOne, "user-password565") +" "+ userOne.isBlocked);
        System.out.println(userOne.user + " You have: "+ userOne.countLog +" try! " + service.login(userOne, "user-password") +" "+ userOne.isBlocked);

        System.out.println("-------------------------------------------------------------------------------");

        System.out.println(userOne.user + " You have: "+ userOne.countLog +" try! " + service.login(userOne, "user-password45") +" "+ userOne.isBlocked);
        System.out.println(userOne.user + " You have: "+ userOne.countLog +" try! " + service.login(userOne, "user-passwor3") +" "+ userOne.isBlocked);
        System.out.println(userOne.user + " You have: "+ userOne.countLog +" try! " + service.login(userOne, "user-password4333") +" "+ userOne.isBlocked);

        System.out.println("-------------------------------------------------------------------------------");

        System.out.println(userOne.user + " You have: "+ userOne.countLog +" try! " + service.login(userOne, "user-password98") +" "+ userOne.isBlocked);
        System.out.println(userOne.user + " You have: "+ userOne.countLog +" try! " + service.login(userOne, "user-passwordad") +" "+ userOne.isBlocked);
        System.out.println(userOne.user + " You have: "+ userOne.countLog +" try! " + service.login(userOne, "user-password") +" "+ userOne.isBlocked);
        System.out.println(userOne.user + " You have: "+ userOne.countLog +" try! " + service.login(userOne, "user-passwordad") +" "+ userOne.isBlocked);
        System.out.println(userOne.user + " You have: "+ userOne.countLog +" try! " + service.login(userOne, "user-password467777777") +" "+ userOne.isBlocked);
        System.out.println(userOne.user + " You have: "+ userOne.countLog +" try! " + service.login(userOne, "user-password467777777") +" "+ userOne.isBlocked);
        System.out.println(userOne.user + " You have: "+ userOne.countLog +" try! " + service.login(userOne, "user-password467777777") +" "+ userOne.isBlocked);

    }

}
