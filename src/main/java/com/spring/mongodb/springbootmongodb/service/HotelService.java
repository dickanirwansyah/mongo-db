package com.spring.mongodb.springbootmongodb.service;

import com.spring.mongodb.springbootmongodb.entity.Hotel;
import com.spring.mongodb.springbootmongodb.model.HotelModel;

import java.util.List;

public interface HotelService {

    List<Hotel> listHotel();
    Hotel createdHotel(HotelModel hotel);
    Hotel updatedHotel(HotelModel hotel);
}
