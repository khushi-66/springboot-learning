package com.isrdc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AppRestController {
@GetMapping("/pro")
	public String pro() {
		return "Done.........";
	}

}
