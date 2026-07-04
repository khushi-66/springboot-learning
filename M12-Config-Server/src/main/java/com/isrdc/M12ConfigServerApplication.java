package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@EnableConfigServer
@SpringBootApplication
public class M12ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(M12ConfigServerApplication.class, args);
	}

}
