package com.isrdc.rests;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	@Value("${msg}")
	private String msg;
@GetMapping("/pro")
	public String process() {
	
		return"Hello from M11..."+msg;
	}
}
