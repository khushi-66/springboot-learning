package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient

@SpringBootApplication
public class M7BApplication {

	public static void main(String[] args) {
		SpringApplication.run(M7BApplication.class, args);
	}

}
