package com.spring.mongodb.springbootmongodb.model;

import com.spring.mongodb.springbootmongodb.entity.Address;
import com.spring.mongodb.springbootmongodb.entity.Review;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Getter
@Setter
public class HotelModel {

    private String id;
    private String name;
    private int pricePerNight;
    private Address address;
    private List<Review> reviews;
}
