package com.isrdc.rests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppRestController {
  @GetMapping("/pro")
	public String pro() {
	  System.out.println("################# Process #################");
	  
		return "Some Problm..........";
	}

}
