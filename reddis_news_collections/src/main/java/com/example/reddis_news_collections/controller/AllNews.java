package com.example.reddis_news_collections.controller;

import com.example.reddis_news_collections.dto.Newsdto;
import com.example.reddis_news_collections.model.News;
import com.example.reddis_news_collections.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AllNews {
    @Autowired
    NewsService newsService;
    @GetMapping("/allnews")
    public List<News> getAllNews (){
        return newsService.getAllNews();
    }

}
