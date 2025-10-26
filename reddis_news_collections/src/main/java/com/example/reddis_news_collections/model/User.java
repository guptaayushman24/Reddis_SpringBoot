package com.example.reddis_news_collections.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String email;
    private String password;
    @ElementCollection
    @CollectionTable(
            name = "user_favourite_news",
            joinColumns = @JoinColumn(name = "user_id")
    )
    private List<String> favouritenews;
}