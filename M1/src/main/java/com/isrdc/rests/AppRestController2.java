package com.isrdc.rests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AppRestController2 {

	@GetMapping("/ccc")
	public String ccc() {
		return "done....";
	}
@PostMapping("/ddd")
public String ddd() {
	return "ho gaya....";
}

}
