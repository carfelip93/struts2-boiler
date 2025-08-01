package com.struts2boiler.controller.user;

import com.struts2boiler.model.User;
import com.struts2boiler.dao.UserDAO;
import com.struts2boiler.dao.UserDAOImpl;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;

public class UserAction extends ActionSupport {
    private List<User> users;
    private User user;
    private String username;
    private UserDAO userDAO;

    public UserAction() {
        this.userDAO = new UserDAOImpl();
    }

    public String list() {
        users = userDAO.findAll();
        return SUCCESS;
    }

    public String view() {
        if (username != null) {
            user = userDAO.findByUsername(username);
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