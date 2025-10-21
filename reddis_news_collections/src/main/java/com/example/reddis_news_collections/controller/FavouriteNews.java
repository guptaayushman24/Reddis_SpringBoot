package com.example.reddis_news_collections.controller;

import com.example.reddis_news_collections.dto.FavouriteNewsdto;
import com.example.reddis_news_collections.dto.Newsdto;
import com.example.reddis_news_collections.model.News;
import com.example.reddis_news_collections.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class FavouriteNews {
    @Autowired
    NewsService newsService;
    @PostMapping("/favouritenews")
    public List<News> getFavouriteNews (@RequestBody FavouriteNewsdto favouriteNewsdto){
        System.out.println("Input is"+" "+favouriteNewsdto.getType());
        return newsService.getFavouriteNews(favouriteNewsdto.getType());
    }

}
