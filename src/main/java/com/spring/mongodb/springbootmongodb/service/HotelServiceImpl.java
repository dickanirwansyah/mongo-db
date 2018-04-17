package com.spring.mongodb.springbootmongodb.service;

import com.spring.mongodb.springbootmongodb.dao.HotelDao;
import com.spring.mongodb.springbootmongodb.entity.Hotel;
import com.spring.mongodb.springbootmongodb.model.HotelModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService{

    @Autowired
    private HotelDao hotelDao;

    @Override
    public List<Hotel> listHotel() {
        return hotelDao.listHotel();
    }

    @Override
    public Hotel createdHotel(HotelModel hotel) {
        return hotelDao.createdHotel(hotel);
    }

    @Override
    public Hotel updatedHotel(HotelModel hotel) {
        return hotelDao.updatedHotel(hotel);
    }
}
