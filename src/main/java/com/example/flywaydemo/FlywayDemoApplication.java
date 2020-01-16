package com.example.flywaydemo;

import com.example.flywaydemo.flyway.FlywayRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FlywayDemoApplication {

	private static final Logger logger = LoggerFactory.getLogger(FlywayDemoApplication.class);


	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(FlywayDemoApplication.class, args);

		FlywayRunner flywayRunner = ctx.getBean(FlywayRunner.class);

		try {
			flywayRunner.runFlyway();
		} catch (Exception e) {
			logger.error("Failed : ", e);
			System.exit(1);
		}

		System.exit(0);
	}
}
