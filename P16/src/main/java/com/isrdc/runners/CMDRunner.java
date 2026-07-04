package com.isrdc.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class CMDRunner implements CommandLineRunner
 {
	 public void run(String... args) {
		  System.out.println("CMD Runner is running....");
	    for(String str:args) {
	    	System.out.println(str+"   ^^^^^^^");
	    }
	 }

}
