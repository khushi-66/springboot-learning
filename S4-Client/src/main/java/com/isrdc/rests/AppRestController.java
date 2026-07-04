package com.isrdc.rests;


import java.util.Base64;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class AppRestController {
     @GetMapping("/talk")
	public String talkToS4() {
		RestTemplate rt=new RestTemplate();
		String url="http://localhost:9090/txn";
		String user="khushi";
		String psb="123";
		 String cred= user+":"+psb;
		 byte[] encred=Base64.getEncoder().encode(cred.getBytes());	
		 String key="Authorization";
		 String val="Basic "+new String(encred);
		 HttpHeaders headers=new HttpHeaders();
		 headers.set(key,val);
		 HttpEntity h=new HttpEntity(headers);
		 ResponseEntity<String>resp=rt.exchange(url,HttpMethod.GET,h, String.class);
	String res=	 resp.getBody();
	
	return res;
	}

}
