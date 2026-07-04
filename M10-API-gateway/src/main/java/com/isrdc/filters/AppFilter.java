package com.isrdc.filters;


import java.util.List;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;

import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

@Component
public class AppFilter  implements GlobalFilter{

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		ServerHttpRequest req=exchange.getRequest();
		org.springframework.http.HttpHeaders headers=req.getHeaders();
		
		if(!headers.containsHeader("secret")) {
			throw new RuntimeException("Invalid Exception...........");
		}
	List<String>values=	headers.get("secret");
	
	if(!values.get(0).equals("29c47f2")) {
		throw new RuntimeException("Invalid Exception...........");
	}
	
	
		return chain.filter(exchange);
	}

}
