package com.example.springdemo.service.impl;

import com.example.springdemo.persestence.dao.UserDAO;
import com.example.springdemo.persestence.dao.impl.UserDoaImpl;
import com.example.springdemo.persestence.dto.UserDTO;
import com.example.springdemo.pojo.AddUserRequest;
import com.example.springdemo.pojo.AddUserResponse;
import com.example.springdemo.pojo.GetUserRequest;
import com.example.springdemo.pojo.GetUserResponse;
import com.example.springdemo.service.UserMgmt;
import org.springframework.stereotype.Service;

@Service
public class UserMgmtImpl implements UserMgmt {

    private final UserDAO userDAO;

    public UserMgmtImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public AddUserResponse addUser(AddUserRequest request) {
        AddUserResponse response = new AddUserResponse();
        UserDTO userDTO = new UserDTO();
        userDTO.setName(request.getName());
        userDTO.setAge(request.getAge());
        userDTO.setGender(request.getGender());
        userDAO.addUser(userDTO);
        response.setMessage("User data has been added");
        return response;
    }

    @Override
    public GetUserResponse getUser(GetUserRequest getUserRequest) {
        GetUserResponse response = new GetUserResponse();
        UserDTO userDTO = new UserDTO();
        userDTO = userDAO.getUser(getUserRequest.getId());
        response.setId(userDTO.getId());
        response.setName(userDTO.getName());
        response.setAge(userDTO.getAge());
        response.setGender(userDTO.getGender());
        return response;
    }


}
