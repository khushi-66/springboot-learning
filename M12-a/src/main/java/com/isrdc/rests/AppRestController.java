package com.isrdc.rests;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppRestController {
	@Value("${msg}")
private String message;
	@GetMapping("/info")
	public String information() {
		return "info "+message;
	}
}
