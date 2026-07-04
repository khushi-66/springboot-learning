package com.isrdc.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="properties")
public class Property {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private   Integer propertyId;
private String houseNo;
private String area;
private String city;
@ManyToOne
@JoinColumn(name="tax_payer_id")
private Taxpayer taxpayer;

public Property() {
	super();
}
public Property(String houseNo, String area, String city) {
	super();
	this.houseNo = houseNo;
	this.area = area;
	this.city = city;
}



public Taxpayer getTaxpayer() {
	return taxpayer;
}
public void setTaxpayer(Taxpayer taxpayer) {
	this.taxpayer = taxpayer;
}
public Integer getPropertyId() {
	return propertyId;
}
public void setPropertyId(Integer propertyId) {
	this.propertyId = propertyId;
}
public String getHouseNo() {
	return houseNo;
}
public void setHouseNo(String houseNo) {
	this.houseNo = houseNo;
}
public String getArea() {
	return area;
}
public void setArea(String area) {
	this.area = area;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}


}
