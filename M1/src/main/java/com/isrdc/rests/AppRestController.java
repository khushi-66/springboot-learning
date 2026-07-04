package com.isrdc.rests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppRestController {
@GetMapping("/aaa")
	public String aaa() {
		return "done....";
	}
@PostMapping("/bbb")
public String bbb() {
	return "ho gaya....";
}
}
