package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class P16Application {

	public static void main(String[] args) {
		String [] arr= {"--version=2.3,5,6,7,8","manoj","khushi","sarvesh"};
		SpringApplication.run(P16Application.class, arr);
	}

}
//  Runners classes ----> execute code only once when application context ready and application not startedgitbean