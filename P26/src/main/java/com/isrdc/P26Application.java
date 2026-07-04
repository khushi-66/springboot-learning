package com.isrdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.isrdc.entites.Taxpayer;
import com.isrdc.services.TaxpayerService;

@SpringBootApplication
public class P26Application {

	public static void main(String[] args) {
		  ConfigurableApplicationContext context =SpringApplication.run(P26Application.class, args);
	 TaxpayerService t= context.getBean(TaxpayerService.class);
	 t.saveTaxPayerAndProperty();
	 
	}

}
