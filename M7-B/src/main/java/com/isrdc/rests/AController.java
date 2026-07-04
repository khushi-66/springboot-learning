package com.isrdc.rests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AController {
@GetMapping("/act")
	public String Action() {
		return "act  url  M7-B ";
	}

}
