package com.albino.restaurantappspringboot.datageneration;

import com.albino.restaurantappspringboot.entity.Customer;
import com.albino.restaurantappspringboot.repository.CustomerRepository;

public class DummyDataGeneration {
    

    public  static void  insertDummyCustomers(CustomerRepository customerRepository) {
		 Customer customer = new Customer("Deg", "abz@gmail.com", "9850000068", "calangutee", "1111", 123456);
			customerRepository.save(customer);
			customer = new Customer ("Deg", "abzy@gmail.com", "1122987333", "calangutee", "abc3435T", 123456);
			customerRepository.save(customer);
			customer = new Customer ("sghhkkg", "chjjgg@gjk", "9669999999", "vjjk", "00000000", 123456);
			customerRepository.save(customer);
			customer = new Customer ( "Albino Braganza", "albinobraganza@gmail.com", "9850004062", "Calangute", "123456", 872065);
			customerRepository.save(customer);
			customer = new Customer ( "Ana Braganza", "albino@gmail.co", "8805030000", "Calangute", "024680", 123456);
			customerRepository.save(customer);
			customer = new Customer ( "Albino", "abc@gmail.com", "9999989999", "aaas", "aaasvasa", 123456);
			customerRepository.save(customer);
			customer = new Customer ( "Ashutosh Singh", "ashutoshsingh1711@gmail.com", "7355367284", "Lucknow", "98765432", 112233);
			customerRepository.save(customer);

			
	}

}
