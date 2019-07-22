package com.koal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestSlf4j {
	
	public static void main(String[] args) {
		
		Logger logger = LoggerFactory.getLogger(TestSlf4j.class);
		String message="hello";
		logger.info("This is a test message: {}", message);
		logger.debug(message);
		logger.error(message);
		
	}

}
