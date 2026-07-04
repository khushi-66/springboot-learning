package com.isrdc.rests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppRestController {
@GetMapping("/king")
	public String KimJongun() {
		return" mai kimjongun hun.....";
	}

}
