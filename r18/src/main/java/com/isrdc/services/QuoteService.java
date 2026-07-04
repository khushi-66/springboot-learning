package com.isrdc.services;



import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.isrdc.QuoteDto;

@Service
public class QuoteService {
 public QuoteDto fetchRandomQuote(){
	 QuoteDto dto=null;
	 WebClient webclient=WebClient.create();
	 webclient
	 .get()
	 .uri("https://dummyjson.com/quotes/random")
	 .retrieve()
	 .bodyToMono(QuoteDto.class)
	// .subscribe(new X());
	// .subscribe(dto->System.out.println("dto : "+dto));
	// .subscribe(obj->dto=obj);
	 .subscribe(obj->handleQuoteDto(obj));
	 System.out.println("############## 1  #########################");
	 System.out.println("############## 2  #########################");
	 System.out.println("############## 3  #########################");
	 System.out.println("############## 4  #########################");
	 return dto;
 }
	
 
 private  QuoteDto handleQuoteDto(QuoteDto dto) {
	 return dto;
 }

}

//class X implements Consumer<QuoteDto>{
//	public  void accept(QuoteDto dto) {
//		System.out.println(dto);
//	}
//}
