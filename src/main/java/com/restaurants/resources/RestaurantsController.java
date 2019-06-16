package com.restaurants.resources;

import com.restaurants.resources.models.Restaurants;
import com.restaurants.resources.repositories.RestaurantsRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
        Logger logger = LoggerFactory.getLogger(RestaurantsController.class);
        logger.info("Request received on 'restaurants/all'");
        return repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public List<Restaurants> getRestaurantsById(@PathVariable("id") String id) {
        Logger logger = LoggerFactory.getLogger(RestaurantsController.class);
        logger.info("Request received on 'restaurants/{id}'");
        System.out.println(id);
        return repository.findByid(id);
    }
}
