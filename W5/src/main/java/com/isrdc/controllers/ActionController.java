package com.isrdc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody         //controller +  responseBody annotation => RestController
public class ActionController {
	@GetMapping("/one")
  public String reqOne() {
		return "time up........"; // treated as string message not html file name
	}
}
