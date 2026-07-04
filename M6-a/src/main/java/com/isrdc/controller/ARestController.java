package com.isrdc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isrdc.feigns.M6BFeignClient;

@RestController
public class ARestController {
	@Autowired
	private M6BFeignClient feignclient;
@GetMapping("/pro")
	public String process() {
	String rest=feignclient.callM6BEndpoint();
		return "M6-a -ARestController-process(/pro)....."+rest;
	}

}
