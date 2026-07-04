package com.isrdc.p3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

//import com.isrdc.p3.beans.A;
import com.isrdc.p3.beans.A1;
//import com.isrdc.p3.beans.A1;
import com.isrdc.p3.beans.A2;
import com.isrdc.p3.beans.A3;
import com.isrdc.p3.beans.A4;

@SpringBootApplication
public class P3Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext context=	SpringApplication.run(P3Application.class, args);
	  
	// context.getBean(A.class).process();
	// context.getBean(A1.class).process();
	// context.getBean(A2.class).process();
	 //context.getBean(A3.class).process();
	 context.getBean(A4.class).process();
	
	}

}
//constructor injection