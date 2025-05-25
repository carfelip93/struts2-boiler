package com.struts2boiler.dao;

import com.struts2boiler.model.User;
import java.util.List;

public interface UserDAO {
    List<User> findAll();

    User findByUsername(String username);

    void save(User user);

    void update(User user);

    void delete(String username);
}