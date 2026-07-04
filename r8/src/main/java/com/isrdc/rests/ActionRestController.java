package com.isrdc.rests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActionRestController {
	@GetMapping(value="/pro/{rank}",produces="text/plain")
public String process(@PathVariable Integer rank) {
		System.out.println("hello.........."+rank);
	return"Done"+  rank; 
}

	@GetMapping("/info/{name}/{age}/{marks}/{flag}")
	public    String info(  @PathVariable String name,   @PathVariable Integer age,  @PathVariable Float marks,   @PathVariable Boolean flag) {
		
		return "Ho Gaya  "  +name+"-"+marks+"-" + flag+"-"+age;
	}
}
