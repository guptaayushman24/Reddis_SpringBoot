package com.example.reddis_news_collections.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Newsdto {
    String type;
    String newsheading;
    String newsdetail;
}
