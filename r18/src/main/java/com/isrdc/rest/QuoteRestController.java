package com.isrdc.rest;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isrdc.QuoteDto;
import com.isrdc.services.QuoteService;

@RestController
public class QuoteRestController {
	@Autowired
	private QuoteService serv;
	@GetMapping("/show")
public  ResponseEntity<QuoteDto> randomQuote() {
	QuoteDto dto=serv.fetchRandomQuote();
	HttpHeaders h=new HttpHeaders();
	h.set("data-format", "DtoObject");
	return new ResponseEntity<QuoteDto>(dto, h, HttpStatus.OK);
}
	

}
