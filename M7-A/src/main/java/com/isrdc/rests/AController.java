package com.isrdc.rests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isrdc.feigns.AFeign;

@RestController
public class AController {
	@Autowired
	
	private  AFeign f;
 @GetMapping("/pro")
	public String process() {
		String resp=f.M7b();
		
		return "M7-A communicate   pro url  "+resp;
	}
}
