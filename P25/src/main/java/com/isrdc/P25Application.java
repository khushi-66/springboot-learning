package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.isrdc.services.UserService;

@SpringBootApplication
public class P25Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(P25Application.class, args);
	 UserService s=  context.getBean(UserService.class);
	 s.saveUser();
	   
	}

}
