package com.example.reddis_news_collections.repository;

import com.example.reddis_news_collections.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User,String> {
    User findByEmail(String email);
    @Query("{ 'email': ?0, 'password': ?1 }")
    User findByEmailAndPassword(String email, String password);
}
