package com.JavaGuru1.lv.lesson11.unit;

public class UserService {

        private UserRepository repository = new UserRepository();

        public Integer addUser(User user) {
            User addUser = repository.save(user);
            return addUser.getId();
        }

}
