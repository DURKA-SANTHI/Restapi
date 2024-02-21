package com.example.cc1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Restaurants")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long RestaurantId;
    String RestaurantName;
    String RestaurantCode;
    String RestaurantLoc;
    String TypeofVarities;
    String Cuisine;
    public Long getRestaurantId() {
        return RestaurantId;
    }
    public void setRestaurantId(Long restaurantId) {
        RestaurantId = restaurantId;
    }
    public String getRestaurantName() {
        return RestaurantName;
    }
    public void setRestaurantName(String restaurantName) {
        RestaurantName = restaurantName;
    }
    public String getRestaurantCode() {
        return RestaurantCode;
    }
    public void setRestaurantCode(String restaurantCode) {
        RestaurantCode = restaurantCode;
    }
    public String getRestaurantLoc() {
        return RestaurantLoc;
    }
    public void setRestaurantLoc(String restaurantLoc) {
        RestaurantLoc = restaurantLoc;
    }
    public String getTypeofVarities() {
        return TypeofVarities;
    }
    public void setTypeofVarities(String typeofVarities) {
        TypeofVarities = typeofVarities;
    }
    public String getCuisine() {
        return Cuisine;
    }
    public void setCuisine(String cuisine) {
        Cuisine = cuisine;
    }
    
    
    
}
