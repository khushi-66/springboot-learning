package com.isrdc.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActionRestController {
@GetMapping("/pro")
public String process() {
	return "{\"name\":\"ajay\" ,\"age\":12,\"designation\":\"manager\"}";
}
}
