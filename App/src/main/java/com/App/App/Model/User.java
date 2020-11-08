package com.App.App.Model;

import java.util.UUID;

public class User {

    private final long userId;
    private final String email;
    private final String userName;
    private final String password;


    public User(long userId, String email, String userName, String password) {
        super();
        this.userId = userId;
        this.email = email;
        this.userName = userName;
        this.password = password;
    }

    public long getUserId(){
        return this.userId;
    }

    public String getEmail(){
        return this.email;
    }

    public String getUserName(){
        return this.userName;
    }

    public String getPassword(){
        return this.password;
    }


}
