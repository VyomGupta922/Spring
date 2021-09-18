package com.example.springdemo.controller;

import com.example.springdemo.pojo.AddUserRequest;
import com.example.springdemo.pojo.AddUserResponse;
import com.example.springdemo.pojo.GetUserRequest;
import com.example.springdemo.pojo.GetUserResponse;
import com.example.springdemo.service.UserMgmt;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    private final UserMgmt userMgmt;


    public UserController(UserMgmt userMgmt) {
        this.userMgmt = userMgmt;
    }

    @PostMapping(value = "/add")
    public @ResponseBody
    AddUserResponse addUser(@RequestBody AddUserRequest request){
        AddUserResponse response = new AddUserResponse();
        try {
            response = userMgmt.addUser(request);
        } catch (Exception e){
            System.out.println(e);
        }
        return response;
    }

    @PutMapping(value = "/get")
    public @ResponseBody
    GetUserResponse getUser(@RequestBody GetUserRequest getUserRequest)
    {
        GetUserResponse  getUserResponse= new GetUserResponse();
        try{
            getUserResponse = userMgmt.getUser(getUserRequest);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return getUserResponse;
    }
}
