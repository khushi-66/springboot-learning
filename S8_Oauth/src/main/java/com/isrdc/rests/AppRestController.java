package com.isrdc.rests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppRestController {

	@GetMapping("/pro")
	public String process() {
		return "Accessing resource of s8";
	}
	
	@GetMapping("/info")
	public String information() {
		return "Accessing resource of s8";
	}

}
