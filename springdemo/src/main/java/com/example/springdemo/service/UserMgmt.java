package com.example.springdemo.service;

import com.example.springdemo.pojo.AddUserRequest;
import com.example.springdemo.pojo.AddUserResponse;
import com.example.springdemo.pojo.GetUserRequest;
import com.example.springdemo.pojo.GetUserResponse;

public  interface UserMgmt {

    AddUserResponse addUser(AddUserRequest request);
    GetUserResponse getUser(GetUserRequest getUserRequest);
}

