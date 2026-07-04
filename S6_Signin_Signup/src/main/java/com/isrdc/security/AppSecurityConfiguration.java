package com.isrdc.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.isrdc.services.EmployeeService;

@Configuration
@EnableWebSecurity
public class AppSecurityConfiguration {
   @Autowired
	private EmployeeService serv;
   
   @Bean
   public AuthenticationProvider authprovider() {
	   DaoAuthenticationProvider pro=new DaoAuthenticationProvider(serv);
	   pro.setPasswordEncoder(passwEncoder());
	   return pro;
   }
   
   @Bean
   public AuthenticationManager authmanager(AuthenticationConfiguration conf) {
	   
	   return conf.getAuthenticationManager();
   }
   
   @Bean
   public PasswordEncoder passwEncoder() {
	   
	   return new BCryptPasswordEncoder();
   }
   
   @Bean
   public SecurityFilterChain securityconfig(HttpSecurity sec) {
	   
	   sec.authorizeHttpRequests(req-> req.requestMatchers("/signup","/signin").permitAll().anyRequest().authenticated())
	   .httpBasic(Customizer.withDefaults())
	   .formLogin(Customizer.withDefaults());
	   
	   return sec.csrf(csrf->csrf.disable()).build();
	    }
	

}
