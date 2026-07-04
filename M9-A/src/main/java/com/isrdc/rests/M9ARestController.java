package com.isrdc.rests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isrdc.feigns.Afeign;

@RestController
public class M9ARestController {
	@Autowired
	private Afeign f;
    @GetMapping("/pro")
	public String process() {
		return "M9-A pro().. "+f.M9_B();
	}
			

}
