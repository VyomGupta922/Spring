package com.example.springdemo.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class GetUserResponse implements Serializable {

    @JsonProperty(required = true)
    private String id;

    @JsonProperty(required = true)
    private String name;

    @JsonProperty(required = true)
    private String age;

    @JsonProperty(required = true)
    private String gender;

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
