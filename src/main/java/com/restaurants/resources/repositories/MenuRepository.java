package com.restaurants.resources.repositories;

import com.restaurants.resources.models.Menu;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface MenuRepository extends MongoRepository <Menu, String> {

}
