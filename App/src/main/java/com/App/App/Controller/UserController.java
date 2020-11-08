package com.App.App.Controller;

import com.App.App.Model.User;
import com.App.App.Repository.UserRepository;

public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public int addUser(User user){
        return userRepository.insertUser(user);
    }

}
