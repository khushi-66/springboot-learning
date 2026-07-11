package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class S10SchedulingApplication {

	public static void main(String[] args) {
		SpringApplication.run(S10SchedulingApplication.class, args);
	}

}
