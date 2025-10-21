package com.example.reddis_news_collections.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

//@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Document(collection  = "News_Collection")
public class News {
    @Id
    private String id;
    String type;
    String newsheading;
    String newsdetail;
}
