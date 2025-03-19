package com.albino.restaurantappspringboot.datageneration;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.albino.restaurantappspringboot.entity.Customer;
import com.albino.restaurantappspringboot.entity.Restaurant;
import com.albino.restaurantappspringboot.entity.RestaurantDishes;
import com.albino.restaurantappspringboot.repository.CustomerRepository;
import com.albino.restaurantappspringboot.repository.RestaurantDishesRepository;
import com.albino.restaurantappspringboot.repository.RestaurantRepository;

@Service
public class DummyDataGeneration {
    

    public  void  insertDummyCustomers(CustomerRepository customerRepository) {
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

	@Transactional
	public  void  insertDummyRestaurants(RestaurantRepository restaurantRepository, RestaurantDishesRepository restaurantDishesRepository) {
		
		Restaurant r1= new Restaurant("Pind Tadka", "4.1", "https://images.pexels.com/photos/1640777/pexels-photo-1640777.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940", 280);
		
		
		Restaurant r2= new Restaurant("Garbar Burgers", "4.6", "https://images.pexels.com/photos/1639565/pexels-photo-1639565.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940", 200);
		
		
		Restaurant r3= new Restaurant("Baco Tell", "3.4", "https://images.pexels.com/photos/674578/pexels-photo-674578.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500", 300);
		
		
		Restaurant r4= new Restaurant("Heera Mahal", "4.2", "https://images.pexels.com/photos/1300972/pexels-photo-1300972.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500", 300);
		
		
		Restaurant r5= new Restaurant("SmokinChik", "4.0", "https://images.pexels.com/photos/265393/pexels-photo-265393.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500", 250);
		
		
		Restaurant r6= new Restaurant("Swirleys Shack", "3.8", "https://images.pexels.com/photos/699544/pexels-photo-699544.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500", 400);
		
		
		Restaurant r7= new Restaurant("Dominoes bread", "3.6", "https://images.pexels.com/photos/905847/pexels-photo-905847.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500", 200);
		
		
		Restaurant r8= new Restaurant("Everything but Food", "3.2", "https://images.pexels.com/photos/5938/food-salad-healthy-lunch.jpg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940", 150);
		
		
		Restaurant r9= new Restaurant("LFC", "4.0", "https://images.pexels.com/photos/60616/fried-chicken-chicken-fried-crunchy-60616.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500", 200);
		
		
		Restaurant r10= new Restaurant("Central Terk", "5.0", "https://images.pexels.com/photos/434213/pexels-photo-434213.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500", 300);
		
		
		Restaurant r11= new Restaurant("Mitti ke Sandwiches", "4.0", "https://images.pexels.com/photos/1600711/pexels-photo-1600711.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940", 250);
		
		
		Restaurant r12= new Restaurant("Pizza Put", "4.4", "https://images.pexels.com/photos/724216/pexels-photo-724216.jpeg?auto=compress&cs=tinysrgb&h=650&w=940", 350);
		
		
		Restaurant r13= new Restaurant("Burger Jack", "3.7", "https://images.pexels.com/photos/983297/pexels-photo-983297.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940", 250);
		
		
		Restaurant r14= new Restaurant("Rotten Tomatoes", "3.2", "https://images.pexels.com/photos/428301/pexels-photo-428301.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500", 100);
		
		
		Restaurant r15= new Restaurant("NcDonalds", "3.6", "https://images.pexels.com/photos/551991/pexels-photo-551991.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=650&w=940", 150);
		
		
		Restaurant r16= new Restaurant("Askin Poppins", "4.1", "https://images.pexels.com/photos/3631/summer-dessert-sweet-ice-cream.jpg?auto=compress&cs=tinysrgb&dpr=1&w=500", 300);
		
		
		Restaurant r17= new Restaurant("Baasa Menu", "3.4", "https://images.pexels.com/photos/264537/pexels-photo-264537.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500", 200);


		RestaurantDishes d1 =new RestaurantDishes("achaa Aloo Tadka",60.0,r1);
		
		RestaurantDishes d2 =new RestaurantDishes("hajia Tadka",60.0,r1);
		RestaurantDishes d3 =new RestaurantDishes("irchi Tadka",50.0,r1);
		RestaurantDishes d4 =new RestaurantDishes("aal No Tadka",100.0,r1);
		RestaurantDishes d5 =new RestaurantDishes("abhi Burger Kabhi G",100.0,r2);
		RestaurantDishes d6 =new RestaurantDishes("urger from Nothing",140.0,r2);
		RestaurantDishes d7 =new RestaurantDishes("Patty Burger",190.0,r2);
		RestaurantDishes d8 =new RestaurantDishes("Burger",180.0,r2);
		RestaurantDishes d9 =new RestaurantDishes("exican Baco",100.0,r3);
		RestaurantDishes d10 =new RestaurantDishes("Baco Indian",220.0,r3);
		RestaurantDishes d11 =new RestaurantDishes("Roti Tadka",30.0,r1);
		RestaurantDishes d12 =new RestaurantDishes("Chole Tadka",120.0,r1);
		RestaurantDishes d13 =new RestaurantDishes("Gobi Tadka",80.0,r1);
		RestaurantDishes d14 =new RestaurantDishes("Murg Bhadka",150.0,r1);
		RestaurantDishes d15 =new RestaurantDishes("Bhedu Bhadka",180.0,r1);
		RestaurantDishes d16 =new RestaurantDishes("Chola Bhadka",150.0,r1);
		RestaurantDishes d17 =new RestaurantDishes("Galti se Burger",140.0,r2);
		RestaurantDishes d18 =new RestaurantDishes("Sach Much Burger",150.0,r2);
		RestaurantDishes d19 =new RestaurantDishes("Jhootha Burger",150.0,r2);
		RestaurantDishes d20 =new RestaurantDishes("Salty Honey Burger",160.0,r2);
		RestaurantDishes d21 =new RestaurantDishes("Mirchi Ka Burger",130.0,r2);
		RestaurantDishes d22 =new RestaurantDishes("Hope for Burger",120.0,r2);
		RestaurantDishes d23 =new RestaurantDishes("Chotu sa Burger",100.0,r2);
		RestaurantDishes d24 =new RestaurantDishes("Not happening Burger",180.0,r2);
		RestaurantDishes d25 =new RestaurantDishes("Gheese Cordita Taco",200.0,r3);
		RestaurantDishes d26 =new RestaurantDishes("Gheese Cordita Taco",200.0,r3);
		RestaurantDishes d27 =new RestaurantDishes("Kalupa Baco",220.0,r3);
		RestaurantDishes d28 =new RestaurantDishes("Sabudana Baco",180.0,r3);
		RestaurantDishes d29 =new RestaurantDishes("Taco No Baco",240.0,r3);
		RestaurantDishes d30 =new RestaurantDishes("Lizzat Baco",230.0,r3);
		RestaurantDishes d31 =new RestaurantDishes("Gujrati Baco",300.0,r3);
		RestaurantDishes d32 =new RestaurantDishes("Burnt Chicken Baco",200.0,r3);
		RestaurantDishes d33 =new RestaurantDishes("Just Paco",240.0,r3);
		RestaurantDishes d34 =new RestaurantDishes("Paco No More",260.0,r3);
		RestaurantDishes d35 =new RestaurantDishes("Paco Lebanese",340.0,r3);
		RestaurantDishes d36 =new RestaurantDishes("Paco Baco",500.0,r3);
		RestaurantDishes d37 =new RestaurantDishes("Paco Naco",400.0,r3);
		RestaurantDishes d38 =new RestaurantDishes("Heera Kheera",220.0,r4);
		RestaurantDishes d39 =new RestaurantDishes("Bhole Chatura",140.0,r4);
		RestaurantDishes d40 =new RestaurantDishes("Lady Thumb",120.0,r4);
		RestaurantDishes d41 =new RestaurantDishes("Hajmola Jhol",150.0,r4);
		RestaurantDishes d42 =new RestaurantDishes("Reshmi Kebab",250.0,r4);
		RestaurantDishes d43 =new RestaurantDishes("Wormicelli",180.0,r4);
		RestaurantDishes d44 =new RestaurantDishes("Hari Bhari Plate",320.0,r4);
		RestaurantDishes d45 =new RestaurantDishes("Jogger Jagger Shake",220.0,r4);
		RestaurantDishes d46 =new RestaurantDishes("Chota Pav",80.0,r4);
		RestaurantDishes d47 =new RestaurantDishes("Bada Chav",100.0,r4);
		RestaurantDishes d48 =new RestaurantDishes("Farzi Pav",120.0,r4);
		RestaurantDishes d49 =new RestaurantDishes("Khali Pakoda",220.0,r4);
		RestaurantDishes d50 =new RestaurantDishes("Vegetarian Chicken",340.0,r5);
		RestaurantDishes d51 =new RestaurantDishes("Lamb Chicken",320.0,r5);
		RestaurantDishes d52 =new RestaurantDishes("Smoking Chicken",200.0,r5);
		RestaurantDishes d53 =new RestaurantDishes("Chicken and Coke",240.0,r5);
		RestaurantDishes d54 =new RestaurantDishes("Nanha Chicken",180.0,r5);
		RestaurantDishes d55 =new RestaurantDishes("Chicken Khurana",440.0,r5);
		RestaurantDishes d56 =new RestaurantDishes("Chicken ki khees",240.0,r5);
		RestaurantDishes d57 =new RestaurantDishes("Chicken ke ladoo",280.0,r5);
		RestaurantDishes d58 =new RestaurantDishes("Hari Matar Ka Nimona",140.0,r6);
		RestaurantDishes d59 =new RestaurantDishes("Bhutte ki khees",100.0,r6);
		RestaurantDishes d60 =new RestaurantDishes("Benami Kheer",160.0,r6);
		RestaurantDishes d61 =new RestaurantDishes("Baby Shark Fry",440.0,r6);
		RestaurantDishes d62 =new RestaurantDishes("Chur Chur Bhaat",220.0,r6);
		RestaurantDishes d63 =new RestaurantDishes("Chola Jali",170.0,r6);
		RestaurantDishes d64 =new RestaurantDishes("Gobhi Manchuri",120.0,r6);
		RestaurantDishes d65 =new RestaurantDishes("Pyaaz Ka Halwa",190.0,r6);
		RestaurantDishes d66 =new RestaurantDishes("Neem Ki Chai",80.0,r6);
		RestaurantDishes d67 =new RestaurantDishes("Meetha Karela",140.0,r6);
		RestaurantDishes d68 =new RestaurantDishes("Khatta Banana",90.0,r6);
		RestaurantDishes d69 =new RestaurantDishes("Pumpkin Dumpling",240.0,r6);
		RestaurantDishes d70 =new RestaurantDishes("Nasi goreng",160.0,r6);
		RestaurantDishes d71 =new RestaurantDishes("Oats Malai",240.0,r6);
		RestaurantDishes d72 =new RestaurantDishes("Ramgherita Pizza",100.0,r7);
		RestaurantDishes d73 =new RestaurantDishes("Ramgherita Pizza",100.0,r7);
		RestaurantDishes d74 =new RestaurantDishes("Double Bread No Chee",150.0,r7);
		RestaurantDishes d75 =new RestaurantDishes("Sepperoni Pizza",200.0,r7);
		RestaurantDishes d76 =new RestaurantDishes("Bread Loaded Pizza",160.0,r7);
		RestaurantDishes d77 =new RestaurantDishes("Brinjal Pizza",140.0,r7);
		RestaurantDishes d78 =new RestaurantDishes("Yesterday Pizza",200.0,r7);
		RestaurantDishes d79 =new RestaurantDishes("Lost Pizza",180.0,r7);
		RestaurantDishes d80 =new RestaurantDishes("Veg Chic Pizza",240.0,r7);
		RestaurantDishes d81 =new RestaurantDishes("To be Made Pizza",220.0,r7);
		RestaurantDishes d82 =new RestaurantDishes("Pizza Pija",200.0,r7);
		RestaurantDishes d83 =new RestaurantDishes("Pizza Tadka",260.0,r7);
		RestaurantDishes d84 =new RestaurantDishes("Raw Iron Leaves",300.0,r8);
		RestaurantDishes d85 =new RestaurantDishes("Steel Plant",320.0,r8);
		RestaurantDishes d86 =new RestaurantDishes("Cactus Thorns",240.0,r8);
		RestaurantDishes d87 =new RestaurantDishes("Rose Petals",110.0,r8);
		RestaurantDishes d88 =new RestaurantDishes("Magnetic Strips",130.0,r8);
		RestaurantDishes d89 =new RestaurantDishes("Organic Decompose",250.0,r8);
		RestaurantDishes d90 =new RestaurantDishes("Tar Smoothie",140.0,r8);
		RestaurantDishes d91 =new RestaurantDishes("Diesel Shake",170.0,r8);
		RestaurantDishes d92 =new RestaurantDishes("Screw Salad",150.0,r8);
		RestaurantDishes d93 =new RestaurantDishes("Salmonella Bricks",220.0,r8);
		RestaurantDishes d94 =new RestaurantDishes("Fruity Gum",120.0,r8);
		RestaurantDishes d95 =new RestaurantDishes("Chicken Feather",200.0,r9);
		RestaurantDishes d96 =new RestaurantDishes("Chicken outsdishIde",220.0,r9);
		RestaurantDishes d97 =new RestaurantDishes("Non Smokin Chicken",340.0,r9);
		RestaurantDishes d98 =new RestaurantDishes("Chicken Spring",200.0,r9);
		RestaurantDishes d99 =new RestaurantDishes("Chicken Box",200.0,r9);
		RestaurantDishes d100 =new RestaurantDishes("Dancing Chicken",200.0,r9);
		RestaurantDishes d101 =new RestaurantDishes("Chicken Autumn",200.0,r9);
		RestaurantDishes d102 =new RestaurantDishes("Chicken Summer",200.0,r9);
		RestaurantDishes d103 =new RestaurantDishes("Green Chicken",220.0,r9);
		RestaurantDishes d104 =new RestaurantDishes("Chicken Prank",220.0,r9);
		RestaurantDishes d105 =new RestaurantDishes("Cappuccino",120.0,r10);
		RestaurantDishes d106 =new RestaurantDishes("Coffee Latte",140.0,r10);
		RestaurantDishes d107 =new RestaurantDishes("Espresso",160.0,r10);
		RestaurantDishes d108 =new RestaurantDishes("Choco Mocha",200.0,r10);
		RestaurantDishes d109 =new RestaurantDishes("Frappe",130.0,r10);
		RestaurantDishes d110 =new RestaurantDishes("Hazelnut Choco",240.0,r10);
		RestaurantDishes d111 =new RestaurantDishes("Walnut Coco",240.0,r10);
		RestaurantDishes d112 =new RestaurantDishes("Coffee Black",100.0,r10);
		RestaurantDishes d113 =new RestaurantDishes("Coffee Blue",150.0,r10);
		RestaurantDishes d114 =new RestaurantDishes("Soy Coffee",160.0,r10);
		RestaurantDishes d115 =new RestaurantDishes("Choco Muffin",220.0,r10);
		RestaurantDishes d116 =new RestaurantDishes("Choco Chip Cookie",100.0,r10);
		RestaurantDishes d117 =new RestaurantDishes("Bhaalu Patty",100.0,r11);
		RestaurantDishes d118 =new RestaurantDishes("Brinjal Salami",110.0,r11);
		RestaurantDishes d119 =new RestaurantDishes("Mac n Ghee",130.0,r11);
		RestaurantDishes d120 =new RestaurantDishes("Grilled Sand",150.0,r11);
		RestaurantDishes d121 =new RestaurantDishes("Spinach Sandwich",100.0,r11);
		RestaurantDishes d122 =new RestaurantDishes("Yellow Corn Sandwich",130.0,r11);
		RestaurantDishes d123 =new RestaurantDishes("No Surprise Sandwich",100.0,r11);
		RestaurantDishes d124 =new RestaurantDishes("Tandoori Sand",140.0,r11);
		RestaurantDishes d125 =new RestaurantDishes("Sand No Sand",150.0,r11);
		RestaurantDishes d126 =new RestaurantDishes("Pink Bread",90.0,r11);
		RestaurantDishes d127 =new RestaurantDishes("Samosa Sandwich",150.0,r11);
		RestaurantDishes d128 =new RestaurantDishes("Veg Hoarded",240.0,r13);
		RestaurantDishes d129 =new RestaurantDishes("Veg Hoarded",240.0,r13);
		RestaurantDishes d130 =new RestaurantDishes("Veg No Crust",220.0,r13);
		RestaurantDishes d131 =new RestaurantDishes("Veggie Lover",250.0,r13);
		RestaurantDishes d132 =new RestaurantDishes("Vegetable Crusher",280.0,r13);
		RestaurantDishes d133 =new RestaurantDishes("Meat Hater",340.0,r13);
		RestaurantDishes d134 =new RestaurantDishes("Chicken Lover",360.0,r13);
		RestaurantDishes d135 =new RestaurantDishes("Chicken Supreme",400.0,r13);
		RestaurantDishes d136 =new RestaurantDishes("Veg Supreme",300.0,r13);
		RestaurantDishes d137 =new RestaurantDishes("Double Cheese",280.0,r13);
		RestaurantDishes d138 =new RestaurantDishes("Double Crust",240.0,r13);
		RestaurantDishes d139 =new RestaurantDishes("No Cheese No Crust",250.0,r13);
		RestaurantDishes d140 =new RestaurantDishes("Crispy Veg Burger",50.0,r14);
		RestaurantDishes d141 =new RestaurantDishes("Crispy Chicken Burge",60.0,r14);
		RestaurantDishes d142 =new RestaurantDishes("Veg Chilli Cheese Bu",60.0,r14);
		RestaurantDishes d143 =new RestaurantDishes("Chicken Chilli Chees",50.0,r14);
		RestaurantDishes d144 =new RestaurantDishes("Veg Melt Burger",70.0,r14);
		RestaurantDishes d145 =new RestaurantDishes("Chicken Melt Burger",80.0,r14);
		RestaurantDishes d146 =new RestaurantDishes("Veg Tandoor Burger",100.0,r14);
		RestaurantDishes d147 =new RestaurantDishes("Chicken Tandoor Burg",120.0,r14);
		RestaurantDishes d148 =new RestaurantDishes("Crispy Egg Burger",50.0,r14);
		RestaurantDishes d149 =new RestaurantDishes("Egg Supreme Burger",60.0,r14);
		RestaurantDishes d150 =new RestaurantDishes("Chicken Dooper Burge",170.0,r14);
		RestaurantDishes d151 =new RestaurantDishes("Veg Hooter Burger",150.0,r14);
		RestaurantDishes d152 =new RestaurantDishes("Mutton Scooter Burge",250.0,r14);
		RestaurantDishes d153 =new RestaurantDishes("Rotten Soup",80.0,r15);
		RestaurantDishes d154 =new RestaurantDishes("Rotten Soup",80.0,r15);
		RestaurantDishes d155 =new RestaurantDishes("Rotten Salad",100.0,r15);
		RestaurantDishes d156 =new RestaurantDishes("Rotten Bhajiya",100.0,r15);
		RestaurantDishes d157 =new RestaurantDishes("Rotten Chutney",60.0,r15);
		RestaurantDishes d158 =new RestaurantDishes("Rotten Tomatino",130.0,r15);
		RestaurantDishes d159 =new RestaurantDishes("Platter Gone Bad",200.0,r15);
		RestaurantDishes d160 =new RestaurantDishes("Sweet and Sour",180.0,r15);
		RestaurantDishes d161 =new RestaurantDishes("Age Old Gravy",140.0,r15);
		RestaurantDishes d162 =new RestaurantDishes("Tomato Smoothie",150.0,r15);
		RestaurantDishes d163 =new RestaurantDishes("Aloo Patty",40.0,r16);
		RestaurantDishes d164 =new RestaurantDishes("Bhaloo Patty",50.0,r16);
		RestaurantDishes d165 =new RestaurantDishes("Mexican Bhaloo Fatty",60.0,r16);
		RestaurantDishes d166 =new RestaurantDishes("Jalapeno Chappati",80.0,r16);
		RestaurantDishes d167 =new RestaurantDishes("Grilled Bhaloo",80.0,r16);
		RestaurantDishes d168 =new RestaurantDishes("Spicy Chaloo",80.0,r16);
		RestaurantDishes d169 =new RestaurantDishes("Bhaloo Maharaja",140.0,r16);
		RestaurantDishes d170 =new RestaurantDishes("British Fries",60.0,r16);
		RestaurantDishes d171 =new RestaurantDishes("Dilli Fries",70.0,r16);
		RestaurantDishes d172 =new RestaurantDishes("Loca Cola",50.0,r16);
		RestaurantDishes d173 =new RestaurantDishes("Chocolate Flip",120.0,r17);
		RestaurantDishes d174 =new RestaurantDishes("Chocolate Click",150.0,r17);
		RestaurantDishes d175 =new RestaurantDishes("Vanilla Quick",80.0,r17);
		RestaurantDishes d176 =new RestaurantDishes("Butterscotch Trick",140.0,r17);
		RestaurantDishes d177 =new RestaurantDishes("Strawberry Sick",120.0,r17);
		RestaurantDishes d178 =new RestaurantDishes("Mango Twitch",130.0,r17);
		RestaurantDishes d179 =new RestaurantDishes("Pista Switch",170.0,r17);
		RestaurantDishes d180 =new RestaurantDishes("Almond Itch",180.0,r17);
		RestaurantDishes d181 =new RestaurantDishes("Fruity Snitch",200.0,r17);
		RestaurantDishes d182 =new RestaurantDishes("Honey Glitch",200.0,r17);
		

		
		//restaurantRepository.save(r1);

		
		restaurantDishesRepository.save(d1);
		restaurantDishesRepository.save(d2);
		restaurantDishesRepository.save(d3);
		restaurantDishesRepository.save(d4);
		restaurantDishesRepository.save(d5);
		restaurantDishesRepository.save(d6);
		restaurantDishesRepository.save(d7);
		restaurantDishesRepository.save(d8);
		restaurantDishesRepository.save(d9);
		restaurantDishesRepository.save(d10);
		restaurantDishesRepository.save(d11);
		restaurantDishesRepository.save(d12);
		restaurantDishesRepository.save(d13);
		restaurantDishesRepository.save(d14);
		restaurantDishesRepository.save(d15);
		restaurantDishesRepository.save(d16);
		restaurantDishesRepository.save(d17);
		restaurantDishesRepository.save(d18);
		restaurantDishesRepository.save(d19);
		restaurantDishesRepository.save(d20);
		restaurantDishesRepository.save(d21);
		restaurantDishesRepository.save(d22);
		restaurantDishesRepository.save(d23);
		restaurantDishesRepository.save(d24);
		restaurantDishesRepository.save(d25);
		restaurantDishesRepository.save(d26);
		restaurantDishesRepository.save(d27);
		restaurantDishesRepository.save(d28);
		restaurantDishesRepository.save(d29);
		restaurantDishesRepository.save(d30);
		restaurantDishesRepository.save(d31);
		restaurantDishesRepository.save(d32);
		restaurantDishesRepository.save(d33);
		restaurantDishesRepository.save(d34);
		restaurantDishesRepository.save(d35);
		restaurantDishesRepository.save(d36);
		restaurantDishesRepository.save(d37);
		restaurantDishesRepository.save(d38);
		restaurantDishesRepository.save(d39);
		restaurantDishesRepository.save(d40);
		restaurantDishesRepository.save(d41);
		restaurantDishesRepository.save(d42);
		restaurantDishesRepository.save(d43);
		restaurantDishesRepository.save(d44);
		restaurantDishesRepository.save(d45);
		restaurantDishesRepository.save(d46);
		restaurantDishesRepository.save(d47);
		restaurantDishesRepository.save(d48);
		restaurantDishesRepository.save(d49);
		restaurantDishesRepository.save(d50);
		restaurantDishesRepository.save(d51);
		restaurantDishesRepository.save(d52);
		restaurantDishesRepository.save(d53);
		restaurantDishesRepository.save(d54);
		restaurantDishesRepository.save(d55);
		restaurantDishesRepository.save(d56);
		restaurantDishesRepository.save(d57);
		restaurantDishesRepository.save(d58);
		restaurantDishesRepository.save(d59);
		restaurantDishesRepository.save(d60);
		restaurantDishesRepository.save(d61);
		restaurantDishesRepository.save(d62);
		restaurantDishesRepository.save(d63);
		restaurantDishesRepository.save(d64);
		restaurantDishesRepository.save(d65);
		restaurantDishesRepository.save(d66);
		restaurantDishesRepository.save(d67);
		restaurantDishesRepository.save(d68);
		restaurantDishesRepository.save(d69);
		restaurantDishesRepository.save(d70);
		restaurantDishesRepository.save(d71);
		restaurantDishesRepository.save(d72);
		restaurantDishesRepository.save(d73);
		restaurantDishesRepository.save(d74);
		restaurantDishesRepository.save(d75);
		restaurantDishesRepository.save(d76);
		restaurantDishesRepository.save(d77);
		restaurantDishesRepository.save(d78);
		restaurantDishesRepository.save(d79);
		restaurantDishesRepository.save(d80);
		restaurantDishesRepository.save(d81);
		restaurantDishesRepository.save(d82);
		restaurantDishesRepository.save(d83);
		restaurantDishesRepository.save(d84);
		restaurantDishesRepository.save(d85);
		restaurantDishesRepository.save(d86);
		restaurantDishesRepository.save(d87);
		restaurantDishesRepository.save(d88);
		restaurantDishesRepository.save(d89);
		restaurantDishesRepository.save(d90);
		restaurantDishesRepository.save(d91);
		restaurantDishesRepository.save(d92);
		restaurantDishesRepository.save(d93);
		restaurantDishesRepository.save(d94);
		restaurantDishesRepository.save(d95);
		restaurantDishesRepository.save(d96);
		restaurantDishesRepository.save(d97);
		restaurantDishesRepository.save(d98);
		restaurantDishesRepository.save(d99);
		restaurantDishesRepository.save(d100);
		restaurantDishesRepository.save(d101);
		restaurantDishesRepository.save(d102);
		restaurantDishesRepository.save(d103);
		restaurantDishesRepository.save(d104);
		restaurantDishesRepository.save(d105);
		restaurantDishesRepository.save(d106);
		restaurantDishesRepository.save(d107);
		restaurantDishesRepository.save(d108);
		restaurantDishesRepository.save(d109);
		restaurantDishesRepository.save(d110);
		restaurantDishesRepository.save(d111);
		restaurantDishesRepository.save(d112);
		restaurantDishesRepository.save(d113);
		restaurantDishesRepository.save(d114);
		restaurantDishesRepository.save(d115);
		restaurantDishesRepository.save(d116);
		restaurantDishesRepository.save(d117);
		restaurantDishesRepository.save(d118);
		restaurantDishesRepository.save(d119);
		restaurantDishesRepository.save(d120);
		restaurantDishesRepository.save(d121);
		restaurantDishesRepository.save(d122);
		restaurantDishesRepository.save(d123);
		restaurantDishesRepository.save(d124);
		restaurantDishesRepository.save(d125);
		restaurantDishesRepository.save(d126);
		restaurantDishesRepository.save(d127);
		restaurantDishesRepository.save(d128);
		restaurantDishesRepository.save(d129);
		restaurantDishesRepository.save(d130);
		restaurantDishesRepository.save(d131);
		restaurantDishesRepository.save(d132);
		restaurantDishesRepository.save(d133);
		restaurantDishesRepository.save(d134);
		restaurantDishesRepository.save(d135);
		restaurantDishesRepository.save(d136);
		restaurantDishesRepository.save(d137);
		restaurantDishesRepository.save(d138);
		restaurantDishesRepository.save(d139);
		restaurantDishesRepository.save(d140);
		restaurantDishesRepository.save(d141);
		restaurantDishesRepository.save(d142);
		restaurantDishesRepository.save(d143);
		restaurantDishesRepository.save(d144);
		restaurantDishesRepository.save(d145);
		restaurantDishesRepository.save(d146);
		restaurantDishesRepository.save(d147);
		restaurantDishesRepository.save(d148);
		restaurantDishesRepository.save(d149);
		restaurantDishesRepository.save(d150);
		restaurantDishesRepository.save(d151);
		restaurantDishesRepository.save(d152);
		restaurantDishesRepository.save(d153);
		restaurantDishesRepository.save(d154);
		restaurantDishesRepository.save(d155);
		restaurantDishesRepository.save(d156);
		restaurantDishesRepository.save(d157);
		restaurantDishesRepository.save(d158);
		restaurantDishesRepository.save(d159);
		restaurantDishesRepository.save(d160);
		restaurantDishesRepository.save(d161);
		restaurantDishesRepository.save(d162);
		restaurantDishesRepository.save(d163);
		restaurantDishesRepository.save(d164);
		restaurantDishesRepository.save(d165);
		restaurantDishesRepository.save(d166);
		restaurantDishesRepository.save(d167);
		restaurantDishesRepository.save(d168);
		restaurantDishesRepository.save(d169);
		restaurantDishesRepository.save(d170);
		restaurantDishesRepository.save(d171);
		restaurantDishesRepository.save(d172);
		restaurantDishesRepository.save(d173);
		restaurantDishesRepository.save(d174);
		restaurantDishesRepository.save(d175);
		restaurantDishesRepository.save(d176);
		restaurantDishesRepository.save(d177);
		restaurantDishesRepository.save(d178);
		restaurantDishesRepository.save(d179);
		restaurantDishesRepository.save(d180);
		restaurantDishesRepository.save(d181);
		restaurantDishesRepository.save(d182);
		


	}



}
