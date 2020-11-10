package com.App.App.Model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tweet")
public class Tweet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "author")
    private String author;

    @Column(name = "text")
    private String text;

    @Column(name = "positivity")
    private float positivity;

    @Column(name = "coin")
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "coin",
            joinColumns = @JoinColumn(referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(referencedColumnName = "name"))
    private List<Coin> coin;

    public Tweet(String author, String text, float positivity) {
        this.author = author;
        this.text = text;
        this.positivity = positivity;
    }

    public Tweet(){
        super();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<Coin> getCoin() {
        return coin;
    }

    public void setCoin(List<Coin> coin) {
        this.coin = coin;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public float getPositivity() {
        return positivity;
    }

    public void setPositivity(float positivity) {
        this.positivity = positivity;
    }

    public long getId(){
        return id;
    }
}
