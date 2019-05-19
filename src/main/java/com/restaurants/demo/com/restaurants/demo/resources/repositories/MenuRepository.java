package com.restaurants.demo.com.restaurants.demo.resources.repositories;

import com.restaurants.demo.com.restaurants.demo.resources.models.Menu;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface MenuRepository extends MongoRepository <Menu, String> {

}
