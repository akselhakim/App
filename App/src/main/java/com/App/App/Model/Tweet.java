package com.App.App.Model;

import javax.persistence.*;

@Entity
@Table(name = "tweet")
public class Tweet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "author")
    private String author;

    @Column(name = "coin")
    private String coin;

    @Column(name = "text")
    private String text;

    @Column(name = "positivity")
    private float positivity;

    public Tweet(String author, String coin, String text, float positivity) {
        this.author = author;
        this.coin = coin;
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

    public String getCoin() {
        return coin;
    }

    public void setCoin(String coin) {
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
