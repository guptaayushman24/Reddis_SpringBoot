package com.example.reddis_news_collections.repository;

import com.example.reddis_news_collections.dto.Newsdto;
//import com.example.reddis_news_collections.model.News;
import com.example.reddis_news_collections.model.News;
import com.example.reddis_news_collections.model.User;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface NewsRepository extends MongoRepository<News, String> {
    List<News> findAll();
    List<News> findByType(String type);

    @Query("{ 'userId': ?0}")
    List<News> findByfavouritenews (String userId);


}
