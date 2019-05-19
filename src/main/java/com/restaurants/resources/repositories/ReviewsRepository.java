package com.restaurants.resources.repositories;

import com.restaurants.resources.models.Reviews;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ReviewsRepository extends MongoRepository <Reviews, String> {

}
