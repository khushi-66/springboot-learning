package com.isrdc.rests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isrdc.utils.util;

@RestController
public class AppRestController {
	@Autowired
	private util util;
@GetMapping("/pro")
	public String process() {
		System.out.println(util.getDholakpur());
	
		return "done...";
	}

}
