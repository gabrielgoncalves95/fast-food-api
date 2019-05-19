package com.restaurants.demo.com.restaurants.demo.resources.repositories;

import com.restaurants.demo.com.restaurants.demo.resources.models.Reviews;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ReviewsRepository extends MongoRepository <Reviews, String> {

}
