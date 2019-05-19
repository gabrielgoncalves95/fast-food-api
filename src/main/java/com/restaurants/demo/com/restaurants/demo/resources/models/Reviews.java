package com.restaurants.demo.com.restaurants.demo.resources.models;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class Reviews {

    @Id
    public ObjectId _id;
    public String date;
    public String name;
    public String comments;
    public Float rating;
    public String restaurantId;

    public Reviews(){}

}