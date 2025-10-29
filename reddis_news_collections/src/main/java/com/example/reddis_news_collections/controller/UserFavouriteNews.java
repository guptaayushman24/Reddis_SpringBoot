package com.example.reddis_news_collections.controller;

import com.example.reddis_news_collections.component.LoggedInUserContext;
import com.example.reddis_news_collections.component.ReddisService;
import com.example.reddis_news_collections.model.News;
import com.example.reddis_news_collections.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class UserFavouriteNews {
    @Autowired
    NewsService newsService;
    @Autowired
    LoggedInUserContext loggedInUserContext;
    @Autowired
    ReddisService reddisService;
    @GetMapping("/userfavouritenews")
    public List<News> getUserFavouriteNews (){
        // import id from the signin controller
        SignInController signInController = new SignInController();
        if (loggedInUserContext.getUserId()==null){
            return null;
        }
        List<News> userFavouriteNews = reddisService.retrieveData(String.valueOf(loggedInUserContext.getUserId()));
        return userFavouriteNews;
         // return newsService.getUserFavouriteNews(loggedInUserContext.getUserId());

    }
}
