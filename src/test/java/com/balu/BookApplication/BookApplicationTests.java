package com.balu.BookApplication;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BookApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(BookApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("Test cases are executing..!");
		assertEquals(true, true);
	}

}
