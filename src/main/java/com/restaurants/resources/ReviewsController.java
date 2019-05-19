package com.restaurants.resources;

import com.restaurants.resources.models.Reviews;
import com.restaurants.resources.repositories.ReviewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@CrossOrigin
@RequestMapping("/reviews")
@RestController
public class ReviewsController {
    @Autowired
    private ReviewsRepository repository;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Reviews> getAllOptions() {
        Logger logger = LoggerFactory.getLogger(ReviewsController.class);
        logger.info("Request received on 'reviews/all'");
        return repository.findAll();
    }
}