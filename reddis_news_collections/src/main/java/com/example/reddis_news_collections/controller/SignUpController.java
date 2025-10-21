package com.example.reddis_news_collections.controller;
import com.example.reddis_news_collections.model.User;
import com.example.reddis_news_collections.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;


//class UserSignup{
//    int id;
//    String name;
//
//    UserSignup (int id,String name){
//        this.id = id;
//        this.name = name;
//    }
//
//    // Setter
//    public void setId(int id){
//        this.id = id;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    // Getter
//    public int getId() {
//        return id;
//    }
//    public String getName(){
//        return name;
//    }
//}
@RestController
public class SignUpController {
//    HashMap<Integer, String> userDeatil = new HashMap<>();
    @Autowired
    UserService userService;

    @PostMapping("/signup")
    public String userSignup(@RequestBody User user) {
//        boolean userId = userDeatil.containsKey(userSignup.getId());
//        if (userId) {
//            UserSignup user = new UserSignup(userSignup.getId(), userDeatil.get(userSignup.getId()));
//            return user;
//        }
//        UserSignup newUser = new UserSignup(userSignup.getId(),userSignup.getName());
//        userDeatil.put(userSignup.getId(),userSignup.getName());
//       return newUser;
        return userService.saveUser(user);
    }
}
