package com.albino.restaurantappspringboot.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "restaurants")
public class Restaurant {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "restaurantId")
    private Long restaurantId;
    
    @Column(name = "restaurantName")
    private String restaurantName;
    
    @Column(name = "restaurantRating")
    private String restaurantRating;
    
    @Column(name = "imageUrl")
    private String imageUrl;
    
    @Column(name = "costForOne")
    private Integer costForOne;

    @OneToMany(mappedBy = "restaurant",cascade = CascadeType.ALL)
    private List<RestaurantDishes> restaurantDishes;

    
    public Restaurant() {
    }

    public Long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantRating() {
        return restaurantRating;
    }

    public void setRestaurantRating(String restaurantRating) {
        this.restaurantRating = restaurantRating;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getCostForOne() {
        return costForOne;
    }

    public void setCostForOne(Integer costForOne) {
        this.costForOne = costForOne;
    }

    public Restaurant(String restaurantName, String restaurantRating, String imageUrl, Integer costForOne) {
        this.restaurantName = restaurantName;
        this.restaurantRating = restaurantRating;
        this.imageUrl = imageUrl;
        this.costForOne = costForOne;
    }

    @Override
    public String toString() {
        return "Restaurant [restaurantId=" + restaurantId + ", restaurantName=" + restaurantName + ", restaurantRating="
                + restaurantRating + ", imageUrl=" + imageUrl + ", costForOne=" + costForOne + "]";
    }

    public List<RestaurantDishes> getRestaurantDishes() {
        return restaurantDishes;
    }

    public void setRestaurantDishes(List<RestaurantDishes> restaurantDishes) {
        this.restaurantDishes = restaurantDishes;
    }


    



}
