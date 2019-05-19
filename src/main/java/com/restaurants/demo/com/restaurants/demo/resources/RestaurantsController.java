package com.restaurants.demo.com.restaurants.demo.resources;

import com.restaurants.demo.com.restaurants.demo.resources.models.Restaurants;
import com.restaurants.demo.com.restaurants.demo.resources.repositories.RestaurantsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequestMapping("/restaurants")
@RestController
public class RestaurantsController {
    @Autowired
    private RestaurantsRepository repository;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Restaurants> getAllRestaurants() {
        return repository.findAll();
    }
}
