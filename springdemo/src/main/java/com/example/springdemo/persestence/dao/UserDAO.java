package com.example.springdemo.persestence.dao;

import com.example.springdemo.persestence.dto.UserDTO;

public interface UserDAO {
    UserDTO addUser(UserDTO userDTO);
    UserDTO getUser(String id);

}
