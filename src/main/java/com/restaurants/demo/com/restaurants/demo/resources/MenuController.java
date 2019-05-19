package com.restaurants.demo.com.restaurants.demo.resources;

import com.restaurants.demo.com.restaurants.demo.resources.models.Menu;
import com.restaurants.demo.com.restaurants.demo.resources.repositories.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequestMapping("/menu")
@RestController
public class MenuController {
    @Autowired
    private MenuRepository repository;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Menu> getAllOptions() {
        return repository.findAll();
    }
}