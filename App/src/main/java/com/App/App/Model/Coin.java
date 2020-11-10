package com.App.App.Model;


import javax.persistence.*;
import java.util.List;

@Table(name = "coin")
@Entity
public class Coin {

    @Id
    @Column(name = "name")
    private String name;

    @Column(name = "keyword")
    private String keyword;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "coin")
    private List<User> users;

    public Coin(String name, String keyword){
        this.keyword = keyword;
        this.name = name;
    }

    public Coin(){
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
