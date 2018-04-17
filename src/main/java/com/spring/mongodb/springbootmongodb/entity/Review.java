package com.spring.mongodb.springbootmongodb.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "review")
public class Review {

    private String username;
    private int rating;
    private boolean approved;

    protected Review(){}

    public Review(String username, int rating, boolean approved){
        this.username = username;
        this.rating = rating;
        this.approved = approved;
    }

    public String getUsername(){
        return username;
    }

    public int getRating(){
        return rating;
    }

    public boolean isApproved(){
        return approved;
    }
}
