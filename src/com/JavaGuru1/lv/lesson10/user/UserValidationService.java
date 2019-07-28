package com.JavaGuru1.lv.lesson10.user;

public class UserValidationService {

    public void validate(User user) {
        validateFirstName(user.getFirstName());
        validateLastName(user.getLastName());
        validateAge(user.getAge());
    }

    private void validateFirstName(String firstName) {
        if (firstName.length() < 3 || firstName.length() > 15) {
            throw new UserValidationException("First Name length should be more than 3 symbols and less than 15!");
        }
    }

    private void validateLastName(String lastName) {
        if (lastName.length() < 3 || lastName.length() > 15) {
            throw new UserValidationException("Last Name length should be more than 3 symbols and less than 15!");
        }
    }

    private void validateAge(int age) {
        if (age <= 0 || age >= 120) {
            throw new UserValidationException("Age should be from 0 to 250!");
        }
    }

}
