package com.App.App.Model;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private long userId;

    @Column(name = "email")
    private String email;

    @Column(name = "username")
    private String userName;

    @Column(name = "password")
    private String password;


    public User(){
        super();
    }

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
