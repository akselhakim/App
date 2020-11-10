package com.App.App.Model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

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

    @Column(name = "coin")
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "coin",
            joinColumns = @JoinColumn(referencedColumnName = "user_id"),
            inverseJoinColumns = @JoinColumn(referencedColumnName = "name"))
    private List<Coin> coin;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

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
