package com.isrdc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isrdc.entities.User;
import com.isrdc.repo.userRepo;

@Service
public class userService {
	
 private userRepo userrepo;
	
	@Autowired
	public userService(userRepo u) {
		this.userrepo=u;
	}
	public void saveUser() {
		User user=new User();
		user.setEmail("vidyut@gmail.com");
		user.setName("vidyut");
		//user.setPassword("76347");
		userrepo.save(user);
	}
	
	
}
