package com.isrdc.rests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BRestController {
@GetMapping("/info")
	public String process() {
		return "    communicate with.... M6-b BRestController-info.....";
	}

}
