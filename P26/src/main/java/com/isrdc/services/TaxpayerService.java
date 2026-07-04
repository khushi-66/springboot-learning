package com.isrdc.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isrdc.entites.Property;
import com.isrdc.entites.Taxpayer;
import com.isrdc.repos.TaxpayerRepo;


@Service
public class TaxpayerService {
@Autowired
private TaxpayerRepo repo;


public void saveTaxPayerAndProperty() {
	Property p1=new Property();
	p1.setHouseNo("A-34");
	p1.setCity("JBP");
	p1.setArea("34545");
	Property p2=new Property();
	p2.setHouseNo("899/378");
	p2.setCity("Indore");
	p2.setArea("345486");
	
	Taxpayer t=new Taxpayer();
	t.setName("mukund pathakk");
	t.setEmail("pathak@gmail.com");
	t.setAadhar("Abnjmn343");
	
	
	t.setProperties(Arrays.asList(p1,p2));
	p2.setTaxpayer(t);
	p1.setTaxpayer(t);
	repo.save(t);
	
}
}
