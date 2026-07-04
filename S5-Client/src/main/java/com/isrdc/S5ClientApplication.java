package com.isrdc;

import java.util.Base64;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@SpringBootApplication
public class S5ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(S5ClientApplication.class, args);
		
		 String  resp=talk().block();
		 System.out.println(resp);
	}
	
	public static  Mono<String> talk() {
		WebClient wc=WebClient.create();
		String url="http://localhost:9090/txn";
		String user="khushi";
		String psb="123";
		 String cred= user+":"+psb;
		 byte[] encred=Base64.getEncoder().encode(cred.getBytes());	
		 String key="Authorization";
		 String val="Basic "+new String(encred);
	Mono<String> res=wc.get().uri(url).header(key, val).retrieve().bodyToMono(String.class);
	
		return res;
	}

}
