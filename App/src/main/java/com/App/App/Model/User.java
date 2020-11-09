package com.App.App.Model;

import com.App.App.Repository.IUserRepository;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "user_id")
    private Long user_id;

    //@Column(name = "email")
    private String email;

    //@Column(name = "username")
    private String username;

    //@Column(name = "password")
    private String password;


    public User(){
        super();
    }

    public User(long userId, String email, String userName, String password) {
        super();
        this.user_id = userId;
        this.email = email;
        this.username = userName;
        this.password = password;
    }

    public long getUserId(){
        return this.user_id;
    }

    public String getEmail(){
        return this.email;
    }

    public String getUserName(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }


}
