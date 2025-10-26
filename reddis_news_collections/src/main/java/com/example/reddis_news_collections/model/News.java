package com.example.reddis_news_collections.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;


//@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


@Entity
public class News {
    @Id
    private Integer id;
    private String type;
    private String newsheading;
    private String newsdetail;
}
