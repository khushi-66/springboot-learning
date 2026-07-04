package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.isrdc.services.userService;

@SpringBootApplication
public class P18Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(P18Application.class, args);
	    context.getBean(userService.class).saveUser();
	}
     
}
