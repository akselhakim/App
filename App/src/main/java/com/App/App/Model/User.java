package com.App.App.Model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "user", schema = "public")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long user_id;

    @Column(name = "email")
    private String email;
    
    @Column(name = "password")
    private String password;

    @Column(name = "name")
    private String name;
    
    public User(){
        super();
    }

    public User(Long user_id, String email, String password, String name) {
        this.user_id = user_id;
        this.email = email;
        this.password = password;
        this.name = name;
    }

    public long getUserId(){
        return this.user_id;
    }

    public String getEmail(){
        return this.email;
    }

    public String getName(){
        return this.name;
    }

    public String getPassword(){
        return this.password;
    }


}
