package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.isrdc.beans.Abean;


@SpringBootApplication
public class P15Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(P15Application.class, args);
	//context.getBean(Abean.class).showInfo();
	    
	}
	
	
}


//bean classes  Annotations..........
