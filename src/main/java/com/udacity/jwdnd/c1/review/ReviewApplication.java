package com.udacity.jwdnd.c1.review;

import com.udacity.jwdnd.c1.review.service.MessageService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReviewApplication.class, args);
	}

	// Create a no-dependencies bean called message. It should be a String like "Hello, Spring!"
	@Bean
	public String message(){
		System.out.println("Creating message bean");
		return "Hello, Spring!";
	}

}
