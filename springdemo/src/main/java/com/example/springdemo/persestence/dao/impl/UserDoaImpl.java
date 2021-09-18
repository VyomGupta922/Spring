package com.example.springdemo.persestence.dao.impl;

import com.example.springdemo.persestence.dao.UserDAO;
import com.example.springdemo.persestence.dto.UserDTO;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class UserDoaImpl implements UserDAO {
    private final MongoTemplate mongoTemplate;


    public UserDoaImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public UserDTO addUser(UserDTO userDTO) {
        UserDTO savedUser = mongoTemplate.save(userDTO);
        return savedUser;
    }

    @Override
    public UserDTO getUser(String id) {
      UserDTO userDTO = new UserDTO();
      Query query = new Query(Criteria.where("name").is(id));

      userDTO=mongoTemplate.findOne(query,UserDTO.class);

        return userDTO;
    }


}
