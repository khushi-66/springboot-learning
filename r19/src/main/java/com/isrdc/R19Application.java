package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@SpringBootApplication
public class R19Application {

	public static void main(String[] args) {
		SpringApplication.run(R19Application.class, args);
		randomQuotes();
		
	}
	
	// #############################       Synchronous Request   #########################################3
        //  https://localhost:8080/dummyjson.com/quotes/random
	 private  static void randomQuotes() {
		String url="https://dummyjson.com/quotes/random";
		WebClient webclient=WebClient.create();
	Mono<QuoteDto> mono=	webclient
			                      .get()
			                           .uri(url)
			                                    .retrieve()
			                                                .bodyToMono(QuoteDto.class);
	QuoteDto dto=mono.block();
	System.out.println("dto   :  "+dto);
	System.out.println("**********  1 **************");
	System.out.println("**********  2  **************");
	System.out.println("***********  3  *************");
	
	}
}




