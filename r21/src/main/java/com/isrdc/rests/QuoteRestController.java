package com.isrdc.rests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.isrdc.dtos.QuoteDto;
import com.isrdc.services.QuoteService;

import reactor.core.publisher.Mono;

@RestController
public class QuoteRestController {
	@Autowired
	private QuoteService serv;
	@GetMapping("/show/{id}")
   public ResponseEntity<Mono<QuoteDto>> showRandomQuote( @PathVariable Integer id) {
	   Mono<QuoteDto> mono=serv.fetchRandomQuote(id);
      return new ResponseEntity<>(mono,HttpStatus.OK);
	}
	
}
