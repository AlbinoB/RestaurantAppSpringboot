package com.albino.restaurantappspringboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.albino.restaurantappspringboot.datageneration.DummyDataGeneration;
import com.albino.restaurantappspringboot.repository.CustomerRepository;

@SpringBootApplication
public class RestaurantAppSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantAppSpringbootApplication.class, args);
		System.out.println(	"Hola Mundo");
	}

	@Bean
	public CommandLineRunner commandLineRunner(CustomerRepository customerRepository ) {
		return args -> {
			
			//Inserting dummy data
			if (Boolean.parseBoolean(System.getProperty("com.albino.dummy.data.generation"))) {
				DummyDataGeneration.insertDummyCustomers(customerRepository);
			}
			
			
		};

		
	}


}
