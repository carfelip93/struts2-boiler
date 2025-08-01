package com.struts2boiler.service;

import com.struts2boiler.model.User;
import com.struts2boiler.dto.UserDTO;
import com.struts2boiler.dao.UserDAO;
import com.struts2boiler.dao.UserDAOImpl;
import com.struts2boiler.util.UserMapper;
import java.util.List;

public class UserService {
    private UserDAO userDAO;

    public UserService() {
        this.userDAO = new UserDAOImpl();
    }

    // Internal model methods (use DAO)
    public List<User> getAllUsers() {
        return userDAO.findAll();
    }

    public User getUserByUsername(String username) {
        return userDAO.findByUsername(username);
    }

    public void addUser(User user) {
        userDAO.save(user);
    }

    public void updateUser(User user) {
        userDAO.update(user);
    }

    public void deleteUser(String username) {
        userDAO.delete(username);
    }

    // Public DTO methods (for Controller)
    public List<UserDTO> getAllUserDTOs() {
        return UserMapper.toDTOList(getAllUsers());
    }

    public UserDTO getUserDTOByUsername(String username) {
        User user = getUserByUsername(username);
        return UserMapper.toDTO(user);
    }

    public void addUserDTO(UserDTO userDTO) {
        User user = UserMapper.toModel(userDTO);
        addUser(user);
    }

    public void updateUserDTO(UserDTO userDTO) {
        User user = UserMapper.toModel(userDTO);
        updateUser(user);
    }

    public void deleteUserDTO(String username) {
        deleteUser(username);
    }
}