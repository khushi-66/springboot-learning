package com.isrdc.rests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionRestController {
	@GetMapping("/gen_bill")
public String generateBill() {
	return"";
}
	
	@PostMapping("/create_cart")
	public String createCart() {
		return"";
	}
}
