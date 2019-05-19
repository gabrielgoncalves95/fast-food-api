package com.restaurants.resources;

import com.restaurants.resources.models.Menu;
import com.restaurants.resources.repositories.MenuRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@CrossOrigin
@RequestMapping("/menu")
@RestController
public class MenuController {
    @Autowired
    private MenuRepository repository;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Menu> getAllOptions() {
        Logger logger = LoggerFactory.getLogger(MenuController.class);
        logger.info("Request received on 'menu/all'");
        return repository.findAll();
    }
}