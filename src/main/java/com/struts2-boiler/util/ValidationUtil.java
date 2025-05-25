package com.example.util;

import java.util.regex.Pattern;

public class ValidationUtil {
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");

    private static final Pattern USERNAME_PATTERN = Pattern.compile("^[a-zA-Z0-9_-]{3,16}$");

    public static boolean isValidEmail(String email) {
        if (email == null)
            return false;
        return EMAIL_PATTERN.matcher(email).matches();
    }

    public static boolean isValidUsername(String username) {
        if (username == null)
            return false;
        return USERNAME_PATTERN.matcher(username).matches();
    }

    public static boolean isValidPassword(String password) {
        if (password == null)
            return false;
        return password.length() >= 8 &&
                password.matches(".*[A-Z].*") &&
                password.matches(".*[a-z].*") &&
                password.matches(".*\\d.*");
    }
}