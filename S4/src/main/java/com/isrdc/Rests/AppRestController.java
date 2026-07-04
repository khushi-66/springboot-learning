package com.isrdc.Rests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppRestController {
    @GetMapping("/about")
	public String aboutPage() {
		
    	  return "about page....";
	}
    
    @GetMapping("/contact")
	public String contactPage() {
		
    	  return "contact page....";
	}
    
    @GetMapping("/txn")
	public String TransactionPage() {
		
    	  return "Transaction page....";
	}

}
