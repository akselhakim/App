package com.App.App.Model;

import java.util.UUID;

public class User {

    private final UUID userId;
    private final String userName;
    private final String password;

    public User(UUID userId, String userName, String password) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
    }

    public UUID getUserId(){
        return this.userId;
    }

    public String getUserName(){
        return this.userName;
    }

    public String getPassword(){
        return this.password;
    }


}
