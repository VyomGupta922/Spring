package com.example.springdemo.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class AddUserResponse implements Serializable {

    @JsonProperty(required = true)
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
