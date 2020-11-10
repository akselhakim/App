package com.App.App.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "keyword")
public class Keyword {

    @Id
    @Column(name = "name")
    private String name;

    public Keyword(String name) {
        this.name = name;
    }

    public Keyword(){
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
