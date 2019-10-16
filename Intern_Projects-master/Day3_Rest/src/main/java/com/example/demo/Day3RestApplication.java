package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Day3RestApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day3RestApplication.class, args);
	}
	
	
	@Bean
	RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}