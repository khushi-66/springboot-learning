package com.isrdc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class AInMemorySecurity {
   @Bean
	public InMemoryUserDetailsManager inmerorySecurity() {
		
		UserDetails u1=User.withDefaultPasswordEncoder().username("khushi").password("123").build();
		 UserDetails u2=User.withDefaultPasswordEncoder().username("madhu").password("345").build();
		 UserDetails u3=User.withDefaultPasswordEncoder().username("riya").password("567").build();
		 
		return new InMemoryUserDetailsManager(u1,u2,u3);
	}
	
   
   @Bean
   public SecurityFilterChain filterchain(HttpSecurity httsec )  throws Exception{
	   
	   httsec.authorizeHttpRequests(
			   (Req)->Req.requestMatchers("/about","/contact").permitAll().anyRequest().authenticated()
			        )
	   .httpBasic(Customizer.withDefaults())
	  .formLogin(Customizer.withDefaults());
	   
	   return httsec.build();
   }

}
