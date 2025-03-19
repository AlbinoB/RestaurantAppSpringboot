package com.albino.restaurantappspringboot.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "restaurantdishes")
public class RestaurantDishes {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dishId")
    private Long dishId;

    @Column(name = "dishName")
    private String dishName;

    @Column(name = "dishPrice")
    private Double dishPrice;

    public Long getDishId() {
        return dishId;
    }

    public void setDishId(Long dishId) {
        this.dishId = dishId;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public Double getDishPrice() {
        return dishPrice;
    }

    public void setDishPrice(Double dishPrice) {
        this.dishPrice = dishPrice;
    }


    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "restaurantId")
    private Restaurant restaurant;

    public RestaurantDishes(String dishName, Double dishPrice, Restaurant restaurant) {
        this.dishName = dishName;
        this.dishPrice = dishPrice;
        this.restaurant = restaurant;
    }

    public RestaurantDishes(){}

    @Override
    public String toString() {
        return "RestaurantDishes [dishId=" + dishId + ", dishName=" + dishName + ", dishPrice=" + dishPrice
                + ", restaurant=" + restaurant + "]";
    }

    
    

    
}
