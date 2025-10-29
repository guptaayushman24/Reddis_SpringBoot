package com.example.reddis_news_collections.component;

import com.example.reddis_news_collections.model.News;
import com.example.reddis_news_collections.repository.NewsRepository;
import jakarta.persistence.Cacheable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.data.redis.core.RedisTemplate;

import javax.security.auth.login.LoginContext;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class ReddisService {
    @Autowired
    LoggedInUserContext loggedInUserContext;
    @Autowired
    NewsRepository newsRepository;

    @Autowired
    private RedisTemplate<Integer,Object> redisTemplate;


    public void saveNews (Integer id, List<String> userFavouriteNewsTopic){
        // Extract User Id
        Integer userId = loggedInUserContext.getUserId();
        // Extract their favourite news topic
        List<String> newsTopics = newsRepository.userFavouriteNewsTopic(userId);
        redisTemplate.opsForValue().set(userId, newsTopics, 10, TimeUnit.MINUTES); // Store with a TTL


    }

}
