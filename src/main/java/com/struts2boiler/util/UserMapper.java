package com.struts2boiler.util;

import com.struts2boiler.model.User;
import com.struts2boiler.dto.UserDTO;
import java.util.List;
import java.util.stream.Collectors;

public class UserMapper {

    public static UserDTO toDTO(User user) {
        if (user == null) {
            return null;
        }
        return new UserDTO(
                user.getUsername(),
                user.getEmail(),
                user.getFullName(),
                user.getRole(),
                user.isActive());
    }

    public static User toModel(UserDTO userDTO) {
        if (userDTO == null) {
            return null;
        }
        return new User(
                userDTO.getUsername(),
                userDTO.getEmail(),
                userDTO.getFullName(),
                userDTO.getRole(),
                userDTO.isActive());
    }

    public static List<UserDTO> toDTOList(List<User> users) {
        if (users == null) {
            return null;
        }
        return users.stream()
                .map(UserMapper::toDTO)
                .collect(Collectors.toList());
    }

    public static List<User> toModelList(List<UserDTO> userDTOs) {
        if (userDTOs == null) {
            return null;
        }
        return userDTOs.stream()
                .map(UserMapper::toModel)
                .collect(Collectors.toList());
    }
}