package com.isrdc.rests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApprestController {
    @GetMapping("/pro")
	public String process() {
		return "america donald trump.....";
	}
    
    @GetMapping("info")
    public String informatuon() {
    	
    	
    	  return "North Coria....";
    }

}
