package com.restaurants.resources.repositories;

import com.restaurants.resources.models.Restaurants;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface RestaurantsRepository extends MongoRepository <Restaurants, String> {
    List <Restaurants> findByid(String id);
}
