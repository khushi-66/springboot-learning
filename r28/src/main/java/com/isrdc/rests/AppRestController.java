package com.isrdc.rests;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppRestController {
	@Value("${server.port}")
	private String serverPort;
@GetMapping("/pro")
	public String process() {
	System.out.println(serverPort);
		return "done...";
	}

}
