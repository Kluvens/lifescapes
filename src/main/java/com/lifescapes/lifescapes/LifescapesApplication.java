package com.lifescapes.lifescapes;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class LifescapesApplication implements ApplicationRunner {

	private static final Logger logger = LoggerFactory.getLogger(LifescapesApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LifescapesApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments applicationArguments) throws Exception {
		logger.info("Application Running");
	}

}
