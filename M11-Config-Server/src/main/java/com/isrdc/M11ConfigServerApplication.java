package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@EnableConfigServer
@SpringBootApplication
public class M11ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(M11ConfigServerApplication.class, args);
	}

}
