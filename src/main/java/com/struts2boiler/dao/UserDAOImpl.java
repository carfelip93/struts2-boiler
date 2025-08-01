package com.struts2boiler.dao;

import com.struts2boiler.model.User;
import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDAO {
    private static List<User> users = new ArrayList<>();

    static {
        // Initialize with some sample data
        users.add(new User("john", "john@example.com", "John Doe", "ADMIN", true));
        users.add(new User("jane", "jane@example.com", "Jane Smith", "USER", true));
        users.add(new User("bob", "bob@example.com", "Bob Johnson", "USER", false));
        users.add(new User("alice", "alice@example.com", "Alice Brown", "USER", true));
        users.add(new User("charlie", "charlie@example.com", "Charlie Wilson", "MODERATOR", true));
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(users);
    }

    @Override
    public User findByUsername(String username) {
        return users.stream()
                .filter(user -> user.getUsername().equals(username))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void save(User user) {
        if (user != null && findByUsername(user.getUsername()) == null) {
            users.add(user);
        }
    }

    @Override
    public void update(User user) {
        if (user != null) {
            User existingUser = findByUsername(user.getUsername());
            if (existingUser != null) {
                users.remove(existingUser);
                users.add(user);
            }
        }
    }

    @Override
    public void delete(String username) {
        users.removeIf(user -> user.getUsername().equals(username));
    }
}