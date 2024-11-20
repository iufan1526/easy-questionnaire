package com.easyquestionnaire.user.repository;

import com.easyquestionnaire.user.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, ObjectId> {
    User findByUserId(String userId);
}

