package com.struts2boiler.model;

public class User {
    private String username;
    private String email;
    private String fullName;
    private String role;
    private boolean active;

    public User(String username) {
        this.username = username;
        this.email = username + "@example.com";
        this.fullName = username;
        this.role = "USER";
        this.active = true;
    }

    public User(String username, String email, String fullName, String role, boolean active) {
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