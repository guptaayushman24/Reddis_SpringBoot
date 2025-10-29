package com.example.reddis_news_collections.repository;

import com.example.reddis_news_collections.model.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface NewsRepository extends JpaRepository<News, String> {
    List<News> findAll();
    List<News> findByType(String type);

    @Query(
            value = "SELECT * FROM news WHERE type IN (SELECT favouritenews FROM user_favourite_news WHERE user_id = :userId)",
            nativeQuery = true
    )
    List<News> findByfavouritenews(@Param("userId") Integer userId);

    @Query(
            value = "select * from user_favourite_news where user_id = :userId",
            nativeQuery = true
    )
    List<String> userFavouriteNewsTopic(@Param("userId") Integer userId);


}
