package com.isrdc.beans;

import org.springframework.stereotype.Service;

import com.isrdc.entities.User;
import com.isrdc.repo.UserRepo;

@Service
public class Aservice   {
	private UserRepo  userrepo ;
     public Aservice(UserRepo userrepo) {
    	 this.userrepo=userrepo;
     }
     
     public  void save() {
    	 User u=new User();
    	 u.setEmail("sahujii8277@gmail.com");
    	 u.setName("khushi sahu");
    	 u.setUser_id(1);
    	 u.setPassword("69789");
    	 
    	 userrepo.save(u);
    	 
    	 
    	 
     }
}
