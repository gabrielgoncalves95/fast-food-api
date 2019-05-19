package com.restaurants.resources.models;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class Menu {

    @Id
    public ObjectId _id;
    public String id;
    public String name;
    public String description;
    public Float price;
    public String imagePath;
    public String restaurantId;

    public Menu(){}

}
