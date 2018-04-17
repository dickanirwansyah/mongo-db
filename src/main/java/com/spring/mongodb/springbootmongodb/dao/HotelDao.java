package com.spring.mongodb.springbootmongodb.dao;

import com.spring.mongodb.springbootmongodb.entity.Hotel;
import com.spring.mongodb.springbootmongodb.model.HotelModel;

import java.util.List;

public interface HotelDao {

    List<Hotel> listHotel();
    Hotel createdHotel(HotelModel hotel);
    Hotel updatedHotel(HotelModel hotel);
    Hotel findId(String idhotel);
    Hotel findHotel(String name);
}
