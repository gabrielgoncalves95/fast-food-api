package com.restaurants.demo.com.restaurants.demo.resources;

import com.restaurants.demo.com.restaurants.demo.resources.models.Reviews;
import com.restaurants.demo.com.restaurants.demo.resources.repositories.ReviewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequestMapping("/reviews")
@RestController
public class ReviewsController {
    @Autowired
    private ReviewsRepository repository;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Reviews> getAllOptions() {
        return repository.findAll();
    }
}