package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.isrdc.beans.*;
@SpringBootApplication
public class P5Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(P5Application.class, args);
	//context.getBean(A.class).process();
		context.getBean(A1.class).process();
	}
//Field injection
}
