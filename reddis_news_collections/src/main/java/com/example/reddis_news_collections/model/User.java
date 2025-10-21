package com.example.reddis_news_collections.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Document(collection  = "UserDetails")
public class User {
    @Id
    String id;
    String name;
    String email;
    String password;
    String [] favouritenews;
}