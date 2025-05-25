package com.struts2boiler.controller.user;

import com.struts2boiler.model.User;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;

public class UserAction extends ActionSupport {
    private List<User> users;
    private User user;
    private String username;

    public String list() {
        // Create some sample users
        users = new ArrayList<>();
        users.add(new User("john", "john@example.com", "John Doe", "ADMIN", true));
        users.add(new User("jane", "jane@example.com", "Jane Smith", "USER", true));
        users.add(new User("bob", "bob@example.com", "Bob Johnson", "USER", false));
        return SUCCESS;
    }

    public String view() {
        // Find user by username
        if (username != null) {
            users = new ArrayList<>();
            users.add(new User("john", "john@example.com", "John Doe", "ADMIN", true));
            users.add(new User("jane", "jane@example.com", "Jane Smith", "USER", true));
            users.add(new User("bob", "bob@example.com", "Bob Johnson", "USER", false));

            user = users.stream()
                    .filter(u -> u.getUsername().equals(username))
                    .findFirst()
                    .orElse(null);

            if (user != null) {
                return SUCCESS;
            }
        }
        return ERROR;
    }

    // Getters and Setters
    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}