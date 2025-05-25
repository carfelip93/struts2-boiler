package com.example.controller.user;

import com.opensymphony.xwork2.ActionSupport;
import com.example.model.User;
import com.example.service.UserService;
import java.util.List;

public class UserAction extends ActionSupport {
    private static final long serialVersionUID = 1L;
    private UserService userService;
    private List<User> users;
    private String username;
    private User user;

    public UserAction() {
        userService = new UserService();
    }

    public String list() {
        users = userService.getAllUsers();
        return SUCCESS;
    }

    public String view() {
        user = userService.getUserByUsername(username);
        if (user == null) {
            addActionError("User not found");
            return ERROR;
        }
        return SUCCESS;
    }

    // Getters and setters
    public List<User> getUsers() {
        return users;
    }

    public User getUser() {
        return user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}