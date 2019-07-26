package com.JavaGuru1.lv.lesson11.unit;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {

    private Map<Integer, User> users = new HashMap<>();

    private Integer id = 1;

    public User save(User user) {
        user.setId(id++);
        users.put(user.getId(), user);
        return user;
    }

}
