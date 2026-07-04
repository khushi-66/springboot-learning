package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class M6BApplication {

	public static void main(String[] args) {
		SpringApplication.run(M6BApplication.class, args);
	}

}
