package com.spring.mongodb.springbootmongodb.dao;

import com.spring.mongodb.springbootmongodb.entity.Hotel;
import com.spring.mongodb.springbootmongodb.model.HotelModel;
import com.spring.mongodb.springbootmongodb.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Repository
public class HotelDaoImpl implements HotelDao{

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public List<Hotel> listHotel() {
        List<Hotel> hotels = new ArrayList<>();
        for(Hotel hotel : hotelRepository.findAll()){
            hotels.add(hotel);
        }
        return hotels;
    }

    @Override
    public Hotel createdHotel(HotelModel hotel) {
        String id = hotel.getId();
        Hotel hotelEntiHotel = null;
        boolean valid = false;
        if(id == null){
            hotelEntiHotel = new Hotel();
            valid = true;
        }
        hotelEntiHotel.setAddress(hotel.getAddress());
        hotelEntiHotel.setName(hotel.getName());
        hotelEntiHotel.setPricePerNight(hotel.getPricePerNight());
        hotelEntiHotel.setReviews(hotel.getReviews());
        hotelRepository.save(hotelEntiHotel);
        return hotelEntiHotel;
    }

    private Hotel findones(String id){
        return hotelRepository.findOne(id);
    }

    @Override
    public Hotel updatedHotel(HotelModel hotel) {
        String id = hotel.getId();
        boolean valid = false;
        Hotel hotelEntity = null;
        if(id != null){
            hotelEntity = this.findones(hotel.getId());
            valid = true;
        }
        hotelEntity.setId(hotel.getId());
        hotelEntity.setName(hotel.getName());
        hotelEntity.setPricePerNight(hotel.getPricePerNight());
        hotelEntity.setAddress(hotel.getAddress());
        hotelEntity.setReviews(hotel.getReviews());
        hotelRepository.save(hotelEntity);
        return hotelEntity;
    }

    @Override
    public Hotel findId(String idhotel) {
        return null;
    }

    @Override
    public Hotel findHotel(String name) {
        return null;
    }
}
