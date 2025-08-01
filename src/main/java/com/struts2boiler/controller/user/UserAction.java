package com.struts2boiler.controller.user;

import com.struts2boiler.dto.UserDTO;
import com.struts2boiler.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;

public class UserAction extends ActionSupport {
    private List<UserDTO> users;
    private UserDTO user;
    private String username;
    private UserService userService;

    public UserAction() {
        this.userService = new UserService();
    }

    public String list() {
        users = userService.getAllUserDTOs();
        return SUCCESS;
    }

    public String view() {
        if (username != null) {
            user = userService.getUserDTOByUsername(username);
            if (user != null) {
                return SUCCESS;
            }
        }
        return ERROR;
    }

    public String create() {
        if (user != null) {
            userService.addUserDTO(user);
            addActionMessage("User created successfully!");
            return SUCCESS;
        }
        return ERROR;
    }

    public String update() {
        if (user != null) {
            userService.updateUserDTO(user);
            addActionMessage("User updated successfully!");
            return SUCCESS;
        }
        return ERROR;
    }

    public String delete() {
        if (username != null) {
            userService.deleteUserDTO(username);
            addActionMessage("User deleted successfully!");
            return SUCCESS;
        }
        return ERROR;
    }

    // Getters and Setters
    public List<UserDTO> getUsers() {
        return users;
    }

    public void setUsers(List<UserDTO> users) {
        this.users = users;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}