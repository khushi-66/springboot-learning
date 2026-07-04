package com.isrdc.rests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class AppRestController {
   @GetMapping("/info")
	public String info() {
		return "  communicate with M9-B info()...";
	}
   @GetMapping("/tnc")
   public String transact() {
	   return "transact tnc";
   }

}

