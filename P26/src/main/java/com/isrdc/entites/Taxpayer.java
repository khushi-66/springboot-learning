package com.isrdc.entites;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity

@Table(name="tax_payer")
public class Taxpayer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private   Integer TaxpayerId;
private String name;
private String email;
private String aadhar;
@OneToMany(mappedBy="taxpayer",cascade=CascadeType.ALL)

private List<Property>properties;


public List<Property> getProperties() {
	return properties;
}
public void setProperties(List<Property> properties) {
	this.properties = properties;
}
public Taxpayer() {
	super();
}

public Integer getTaxpayerId() {
	return TaxpayerId;
}
public void setTaxpayerId(Integer taxpayerId) {
	TaxpayerId = taxpayerId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAadhar() {
	return aadhar;
}
public void setAadhar(String aadhar) {
	this.aadhar = aadhar;
}


}
