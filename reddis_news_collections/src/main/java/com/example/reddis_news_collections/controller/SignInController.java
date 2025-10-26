package com.example.reddis_news_collections.controller;

import com.example.reddis_news_collections.component.LoggedInUserContext;
import com.example.reddis_news_collections.dto.SIgninRequestdto;
import com.example.reddis_news_collections.model.User;
import com.example.reddis_news_collections.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SignInController {
    @Autowired
    UserService userService;
    @Autowired
    LoggedInUserContext loggedInUserContext;
    Integer userId = -1;
    @PostMapping("/signin")
    public User SignIn (@RequestBody SIgninRequestdto sIgninRequestdto){
        User user = userService.SignIn(sIgninRequestdto.getEmail(),sIgninRequestdto.getPassword());
       Integer userId = user.getId();
        loggedInUserContext.setUserId(userId);

        return user;
    }
}
