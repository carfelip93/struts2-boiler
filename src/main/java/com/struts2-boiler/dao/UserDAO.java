package com.example.dao;

import com.example.model.User;
import java.util.List;

public interface UserDAO {
    List<User> findAll();

    User findByUsername(String username);

    void save(User user);

    void update(User user);

    void delete(String username);
}