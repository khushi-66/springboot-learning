package com.isrdc.services;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isrdc.entities.Adhaar;
import com.isrdc.entities.User;
import com.isrdc.repos.UserRepo;

@Service
public class UserService {
   @Autowired
   private UserRepo repo;
   
   public void saveUser() {
	   Adhaar a=new Adhaar();
	   a.setAadharNumber("ds5748dfn");
	   a.setExperyDate(LocalDate.now());
	   a.setIssueDate(LocalDate.now().plusYears(5));
	 
	   User u=new User();
	   u.setAddress("jbp");
	   u.setAge(23);
	   u.setEmail("manoj@gmail.com");
	   u.setName("manoj");
	    u.setAadhar(a);
	    a.setUser(u);
	   repo.save(u);
	   
   }
   
}
