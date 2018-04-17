package com.spring.mongodb.springbootmongodb.unit;

import com.spring.mongodb.springbootmongodb.entity.Address;
import com.spring.mongodb.springbootmongodb.entity.Hotel;
import com.spring.mongodb.springbootmongodb.entity.Review;
import com.spring.mongodb.springbootmongodb.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class Dbtesting implements CommandLineRunner{

    @Autowired
    private HotelRepository hotelRepository;


    @Override
    public void run(String... strings) throws Exception {
        /**
        Hotel hotel1 = new Hotel(
            "Hotel JW Marriot",
            17000,
            new Address("Jakarta", "Indonesian"),
                Arrays.asList(
                        new Review("dickanirwansyah", 9, false),
                        new Review("denaflorina", 10, false),
                        new Review("adeliasyiva", 10, true)
                )
        );

        Hotel hotel2 = new Hotel(
                "Hotel Iskandar",
                17500,
                new Address("Manhattan Square", "America"),
                Arrays.asList(
                        new Review("anggundwe", 7, true),
                        new Review("sabrina", 10, true)
                )
        );
        //delete semua hote
        this.hotelRepository.deleteAll();

        List<Hotel> hotelList = Arrays.asList(hotel1, hotel2);
        this.hotelRepository.save(hotelList);
         **/
    }

}
