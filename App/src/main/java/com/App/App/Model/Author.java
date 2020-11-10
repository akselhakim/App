package com.App.App.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "author")
public class Author {

    @Id
    @Column(name = "name")
    private String name;

    @Column(name = "tweet")
    private long tweet_id;

    @Column(name = "accuracy")
    private double accuracyScore;

    public Author(String name, long tweet_id, double accuracyScore){
        this.name = name;
        this.tweet_id = tweet_id;
        this.accuracyScore = accuracyScore;
    }

    public Author(){
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getTweet_id() {
        return tweet_id;
    }

    public void setTweet_id(long tweet_id) {
        this.tweet_id = tweet_id;
    }

    public double getAccuracyScore() {
        return accuracyScore;
    }

    public void setAccuracyScore(double accuracyScore) {
        this.accuracyScore = accuracyScore;
    }
}
