package com.example.reddis_news_collections.controller;

import com.example.reddis_news_collections.component.LoggedInUserContext;
import com.example.reddis_news_collections.component.ReddisService;
import com.example.reddis_news_collections.dto.SIgninRequestdto;
import com.example.reddis_news_collections.model.News;
import com.example.reddis_news_collections.model.User;
import com.example.reddis_news_collections.repository.NewsRepository;
import com.example.reddis_news_collections.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class SignInController {
    @Autowired
    UserService userService;
    @Autowired
    LoggedInUserContext loggedInUserContext;
    @Autowired
    NewsRepository newsRepository;
    @Autowired
    ReddisService reddisService;
    Integer userId = -1;
    @PostMapping("/signin")
    public User SignIn (@RequestBody SIgninRequestdto sIgninRequestdto){
        User user = userService.SignIn(sIgninRequestdto.getEmail(),sIgninRequestdto.getPassword());
       Integer userId = user.getId();
        loggedInUserContext.setUserId(userId);

        if (userId!=-1){
            List<News> userBookMarkNews = newsRepository.findByfavouritenews(userId);
            reddisService.saveNews(String.valueOf(userId),userBookMarkNews);
        }

        return user;
    }
}
