package com.isrdc.rests;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App2RestController {

	@Value("${server.port}")
	private String serverPort;
@GetMapping("/info")
	public String information() {
	System.out.println(serverPort);
		return "done...";
	}

}
