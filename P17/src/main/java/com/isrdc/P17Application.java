package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.isrdc.services.StudentService;

@SpringBootApplication
public class P17Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(P17Application.class, args);
	   StudentService s=  context.getBean(StudentService.class);
	   s.saveAllStudents();
	}

}
