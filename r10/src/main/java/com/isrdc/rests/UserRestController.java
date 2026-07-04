 package com.isrdc.rests;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.isrdc.dtos.Userdto;

import jakarta.servlet.http.HttpServletRequest;
@RestController
public class UserRestController {
	
	@GetMapping(value="/pro", produces = "text/plain")
	public String pro(String json) {  // not working
		Gson gson = new Gson();
		
		Userdto usDto = gson.fromJson(json, Userdto.class);
		
		System.out.println(usDto);
		
		return usDto.toString();
	}
	
	@GetMapping(value="/info", produces = "text/plain")
	public String info(HttpServletRequest request) {  // not working
		String json = request.getParameter("json");
		
		Gson gson = new Gson();
		
		Userdto usDto = gson.fromJson(json, Userdto.class);
		
		System.out.println(usDto);
		
		return usDto.toString();
	}
	
	@PostMapping(value = "/act", produces = "text/plain", consumes = "application/json")
	public String process(@RequestBody Userdto usdto) {
		
		System.out.println(usdto);
		
		return "Done   Json Data :"  + usdto.toString();
	}
}



