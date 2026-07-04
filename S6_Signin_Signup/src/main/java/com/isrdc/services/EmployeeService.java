package com.isrdc.services;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.isrdc.entities.Employee;
import com.isrdc.repos.EmployeeRepo;

@Service
public class EmployeeService implements UserDetailsService {
    @Autowired
	private EmployeeRepo repo;
    
    @Override
    public  UserDetails loadUserByUsername(String email) throws UsernameNotFoundException{
    	
    	   Employee em=  repo.findByEmail(email);
    	  return new User(em.getEmail(),em.getPassword(),Collections.emptyList());
    }
    
    public void saveEmployee(Employee em) {
    	repo.save(em);
    }

}
