package com.example.springdemo.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class GetUserRequest implements Serializable {

    @JsonProperty(required = true)
    private  String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
