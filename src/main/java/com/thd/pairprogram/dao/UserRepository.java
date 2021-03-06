package com.thd.pairprogram.dao;

import com.thd.pairprogram.dto.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends MongoRepository<User, String>{
    void deleteByName(String name);

}
