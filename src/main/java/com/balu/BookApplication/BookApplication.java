package com.balu.BookApplication;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookApplication {

	public static Logger logger = LoggerFactory.getLogger(BookApplication.class);

	@PostConstruct
	public void intt() {
		logger.info("Application started");
	}

	public static void main(String[] args) {
		logger.info("Application executed..!");
		SpringApplication.run(BookApplication.class, args);
	}

}
