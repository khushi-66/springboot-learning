package com.isrdc.security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class InMemorySecurity {
@Bean
	public  InMemoryUserDetailsManager inMemoryUsers() {
		 UserDetails u1=User.withDefaultPasswordEncoder().username("khushi").password("123").build();
		 UserDetails u2=User.withDefaultPasswordEncoder().username("madhu").password("345").build();
		 UserDetails u3=User.withDefaultPasswordEncoder().username("riya").password("456").build();
		 
		
		return new InMemoryUserDetailsManager(u1,u2,u3);
	}

}
