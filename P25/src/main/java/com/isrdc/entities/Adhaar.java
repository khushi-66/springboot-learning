package com.isrdc.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Adhaars")
public class Adhaar {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
 private Integer AdharId;
 private String aadharNumber;
 private LocalDate issueDate;
 private LocalDate experyDate;
 @OneToOne
 @JoinColumn(name="user_id")
 private User user;
 
 
 public User getUser() {
	return user;
}
 public void setUser(User user) {
	this.user = user;
 }
 public Integer getAdharId() {
	return AdharId;
 }
 public void setAdharId(Integer adharId) {
	AdharId = adharId;
 }
 public String getAadharNumber() {
	return aadharNumber;
 }
 public void setAadharNumber(String aadharNumber) {
	this.aadharNumber = aadharNumber;
 }
 public LocalDate getIssueDate() {
	return issueDate;
 }
 public void setIssueDate(LocalDate issueDate) {
	this.issueDate = issueDate;
 }
 public LocalDate getExperyDate() {
	return experyDate;
 }
 public void setExperyDate(LocalDate experyDate) {
	this.experyDate = experyDate;
 }
 
 
}
