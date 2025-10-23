package com.example.reddis_news_collections.controller;

import com.example.reddis_news_collections.component.LoggedInUserContext;
import com.example.reddis_news_collections.model.News;
import com.example.reddis_news_collections.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserFavouriteNews {
    @Autowired
    NewsService newsService;
    @Autowired
    LoggedInUserContext loggedInUserContext;
    @GetMapping("/userfavouritenews")
    public List<News> getUserFavouriteNews (){
        // import id from the signin controller
        SignInController signInController = new SignInController();
        System.out.println("User id in User Favourite News"+" "+loggedInUserContext.getUserId());
        // return newsService.getUserFavouriteNews(loggedInUserContext.getUserId());
        return null;
    }
}
