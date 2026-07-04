package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.isrdc.beans.Aservice;

@SpringBootApplication
public class P14Application {

	public static void main(String[] args) {
		  ConfigurableApplicationContext context=SpringApplication.run(P14Application.class, args);
	       context.getBean(Aservice.class).save();
	   context.close();
	}
//Spring Data JPA....
}
