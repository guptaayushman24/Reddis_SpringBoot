package com.example.reddis_news_collections.service;

import com.example.reddis_news_collections.model.User;
import com.example.reddis_news_collections.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public String saveUser(User user){
        userRepository.save(user);
        return "User saved in DB!!!!";
    }

    public User SignIn (String email,String password){
        return userRepository.findByEmailAndPassword(email,password);

    }
}
