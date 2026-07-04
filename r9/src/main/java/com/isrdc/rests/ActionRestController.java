package com.isrdc.rests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActionRestController {
	@GetMapping("/pro")
public String process(@RequestParam String name ) {
	return "Done  ....."+name;
}
	@GetMapping("/info")
	public String info(String name,Integer age,Float marks,Boolean flag) {
		return name+ "-"+age+"-"+marks+"-"+flag;
	}
}
