package com.spring.mongodb.springbootmongodb.controller;

import com.spring.mongodb.springbootmongodb.entity.Hotel;
import com.spring.mongodb.springbootmongodb.model.HotelModel;
import com.spring.mongodb.springbootmongodb.repository.HotelRepository;
import com.spring.mongodb.springbootmongodb.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/hotel")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @GetMapping
    public ResponseEntity<List<Hotel>> listHotels(){
        return Optional.ofNullable(hotelService.listHotel())
                .map(resultset -> new ResponseEntity<>(resultset, HttpStatus.OK))
                .orElse(new ResponseEntity<List<Hotel>>(HttpStatus.BAD_REQUEST));
    }

    @PostMapping(value = "/created")
    public ResponseEntity<Hotel> createHotel(@RequestBody HotelModel hotel){
        return Optional.ofNullable(hotelService.createdHotel(hotel))
                .map(resultset -> new ResponseEntity<>(resultset, HttpStatus.CREATED))
                .orElse(new ResponseEntity<Hotel>(HttpStatus.BAD_REQUEST));
    }

    @PostMapping(value = "/updated")
    public ResponseEntity<Hotel> updatedHotel(@RequestBody HotelModel hotel){
        return Optional.ofNullable(hotelService.updatedHotel(hotel))
                .map(resultset -> new ResponseEntity<>(resultset, HttpStatus.OK))
                .orElse(new ResponseEntity<Hotel>(HttpStatus.BAD_REQUEST));
    }
}
