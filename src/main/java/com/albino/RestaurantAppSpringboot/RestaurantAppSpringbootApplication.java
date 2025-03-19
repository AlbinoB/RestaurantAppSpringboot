package com.albino.restaurantappspringboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import com.albino.restaurantappspringboot.datageneration.DummyDataGeneration;
import com.albino.restaurantappspringboot.repository.CustomerRepository;
import com.albino.restaurantappspringboot.repository.RestaurantDishesRepository;
import com.albino.restaurantappspringboot.repository.RestaurantRepository;

@SpringBootApplication
public class RestaurantAppSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantAppSpringbootApplication.class, args);
		System.out.println(	"Hola Mundo");
	}

	@Bean
	public CommandLineRunner commandLineRunner(
		CustomerRepository customerRepository,
		DummyDataGeneration dummyDataGeneration,
		RestaurantRepository restaurantRepository,
	 	RestaurantDishesRepository restaurantDishesRepository,
		Environment env
		) {
		return args -> {
			
			System.out.println(env.getProperty("com.albino.dummy.data.generation"));
			//Inserting dummy data
			if (Boolean.parseBoolean(env.getProperty("com.albino.dummy.data.generation"))) {
				dummyDataGeneration.insertDummyCustomers(customerRepository);
				dummyDataGeneration.insertDummyRestaurants(restaurantRepository,restaurantDishesRepository);
			}
			
			
		};

		
	}


}
