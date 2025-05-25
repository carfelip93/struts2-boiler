package com.struts2boiler.service;

import com.struts2boiler.model.User;
import java.util.ArrayList;
import java.util.List;

public class UserService {
    private static List<User> users = new ArrayList<>();

    static {
        // Initialize with some sample data
        users.add(new User("alice"));
        users.add(new User("bob"));
        users.add(new User("charlie"));
    }

    public List<User> getAllUsers() {
        return users;
    }

    public User getUserByUsername(String username) {
        return users.stream()
                .filter(user -> user.getUsername().equals(username))
                .findFirst()
                .orElse(null);
    }

    public void addUser(User user) {
        users.add(user);
    }
}