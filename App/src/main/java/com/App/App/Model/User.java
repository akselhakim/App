package com.App.App.Model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "user", schema = "public")
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long user_id;

    @Column(name = "email")
    private String email;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;


//    public User(){
//        super();
//    }
//
//    public User(Long user_id, String email, String username, String password) {
//        this.user_id = user_id;
//        this.email = email;
//        this.username = username;
//        this.password = password;
//    }

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
