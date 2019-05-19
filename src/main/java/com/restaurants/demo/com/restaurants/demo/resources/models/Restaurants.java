package com.restaurants.demo.com.restaurants.demo.resources.models;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class Restaurants {

    @Id
    public ObjectId _id;
    public String id;
    public String name;
    public String category;
    public String deliberyEstimate;
    public Float rating;
    public String imagePath;
    public String about;
    public String hours;

    public Restaurants(){}

}
