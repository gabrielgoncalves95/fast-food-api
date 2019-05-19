package com.restaurants.demo.com.restaurants.demo.resources.repositories;

import com.restaurants.demo.com.restaurants.demo.resources.models.Restaurants;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface RestaurantsRepository extends MongoRepository <Restaurants, String> {

}
