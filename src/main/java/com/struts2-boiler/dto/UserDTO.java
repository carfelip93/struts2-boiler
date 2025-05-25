package com.example.dto;

import java.io.Serializable;

public class UserDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String username;
    private String email;
    private String fullName;
    private String role;
    private boolean active;

    // Default constructor
    public UserDTO() {
    }

    // Constructor with fields
    public UserDTO(String username, String email, String fullName, String role, boolean active) {
        this.username = username;
        this.email = email;
        this.fullName = fullName;
        this.role = role;
        this.active = active;
    }

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}