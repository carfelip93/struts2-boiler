package com.example.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppConfig {
    private static final Properties properties = new Properties();
    private static final String CONFIG_FILE = "application.properties";

    static {
        try (InputStream input = AppConfig.class.getClassLoader().getResourceAsStream(CONFIG_FILE)) {
            if (input == null) {
                System.err.println("Sorry, unable to find " + CONFIG_FILE);
            } else {
                properties.load(input);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }

    public static String getProperty(String key, String defaultValue) {
        return properties.getProperty(key, defaultValue);
    }

    // Application-specific configuration methods
    public static boolean isDebugMode() {
        return Boolean.parseBoolean(getProperty("app.debug", "false"));
    }

    public static int getMaxUsers() {
        return Integer.parseInt(getProperty("app.max.users", "100"));
    }

    public static String getDefaultRole() {
        return getProperty("app.default.role", "USER");
    }
}