package com.albino.restaurantappspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import com.albino.restaurantappspringboot.entity.RestaurantDishes;

@RepositoryRestResource(path = "restaurantdishes")
public interface  RestaurantDishesRepository extends JpaRepository<RestaurantDishes, Long> {
    

}
