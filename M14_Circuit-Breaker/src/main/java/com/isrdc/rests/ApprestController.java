package com.isrdc.rests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class ApprestController {
	
@GetMapping("/pro")
@CircuitBreaker(fallbackMethod = "proFallback",name="problm1")
	public String process() {
	System.out.println("regular flow :  process(/pro).....");
	int y=10/0;
		return"regular flow :  process(/pro).....";
	}

public String proFallback(Throwable t) {
	System.out.println("fallback flow :  proFallback(/pro).....");
	
	return"fallback flow :  proFallback(/pro).....";
}

}
