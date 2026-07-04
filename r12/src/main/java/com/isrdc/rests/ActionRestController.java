package com.isrdc.rests;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActionRestController {
	
	// ####################    Response Headers #######################
	
//	@GetMapping(value="/pro",produces="text/plain")
@GetMapping(value="/pro",produces="application/json")
	public ResponseEntity<String> process() {
	//	String res="Hello Duniya walon....";
		String res= "{\"age\":23 }";
		HttpHeaders headers=new HttpHeaders();      
		 headers.set("college", "dholakpur");
		 headers.set("Degree", "B.Tech");
	 return new ResponseEntity<>(res, headers,HttpStatus.ACCEPTED);
 }
	
	// ####################    Request Headers #######################
	
	@GetMapping(value="/info")
	public String info(@RequestHeader("accept-encoding")  String acceptEncoding) {
	
	 return "Headers : "+acceptEncoding;
 }
	
	@GetMapping(value="/show")
	public String show(@RequestHeader("lok")  String lok) {
	
	 return "Headers : "+lok;
 }
}
