package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.isrdc.beans.A;

@SpringBootApplication
public class P7Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(P7Application.class, args);
	 A x= context.getBean(A.class);
	 x.doWork();
	}
//PreDestroy and PostConstruct Annotation 
}
