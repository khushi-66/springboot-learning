package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class M9EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(M9EurekaServerApplication.class, args);
	}

}
