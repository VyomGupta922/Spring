package com.example.springdemo.persestence.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.naming.Name;

@Document(collection = "user")
public class UserDTO {

    @Id
    @Field(name = "_id")
    private String id;

    @Field(name ="name")
    private String name;

    @Field(name="age", order = 1)
    private  String age;

    @Field(name="gender")
    private String gender;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
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
