package com.restaurants.resources.repositories;

import com.restaurants.resources.models.Restaurants;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface RestaurantsRepository extends MongoRepository <Restaurants, String> {

}
