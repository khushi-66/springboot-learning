package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.isrdc.Entities.Users;
import com.isrdc.Repos.UserRepo;

@SpringBootApplication
public class P13Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(P13Application.class, args);
	UserRepo repo=  context.getBean(UserRepo.class);
	  Users users=new Users();
	  users.setUser_Id(1);
	  users.setName("yamraj");
	  users.setEmail("yam@yampuri.com");
	  users.setPassword("99999");
	  repo.save(users);
	  context.close();
	  
	}
//Spring data JPA
}
