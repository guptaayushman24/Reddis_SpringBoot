package com.example.reddis_news_collections.service;

import com.example.reddis_news_collections.dto.Newsdto;
import com.example.reddis_news_collections.model.News;
import com.example.reddis_news_collections.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NewsService {
    @Autowired
    NewsRepository newsRepository;
   public List<News> getAllNews(){
       return newsRepository.findAll();
   }
   
   public List<News> getFavouriteNews(String type){
       return newsRepository.findByType(type);
   }

   public List<News> getUserFavouriteNews(String userId){
       return newsRepository.findByfavouritenews(userId);
   }


}
