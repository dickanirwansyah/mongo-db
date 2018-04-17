package com.spring.mongodb.springbootmongodb.repository;

import com.spring.mongodb.springbootmongodb.entity.Hotel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface HotelRepository extends MongoRepository<Hotel, String>{
}
