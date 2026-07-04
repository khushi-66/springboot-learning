package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class P8Application {

	public static void main(String[] args) {
		Object obj=SpringApplication.run(P8Application.class, args);
		System.out.println("Return type of run()   "+obj.getClass().getName());
	}
//POM starter --->   Default 
}
