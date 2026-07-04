package com.isrdc.dtos;

public class StudentDto {
	private Integer studentId;
	   private String name;
	   private String college;
	   private String degree;
	   private Float marks;
	   private Integer fees;
	   
	   
	   public Integer getStudentId() {
		   return studentId;
	   }
	   public void setStudentId(Integer studentId) {
		   this.studentId = studentId;
	   }
	   public String getName() {
		   return name;
	   }
	   public void setName(String name) {
		   this.name = name;
	   }
	   public String getCollege() {
		   return college;
	   }
	   public void setCollege(String college) {
		   this.college = college;
	   }
	   public String getDegree() {
		   return degree;
	   }
	   public void setDegree(String degree) {
		   this.degree = degree;
	   }
	   public Float getMarks() {
		   return marks;
	   }
	   public void setMarks(Float marks) {
		   this.marks = marks;
	   }
	   public Integer getFees() {
		   return fees;
	   }
	   public void setFees(Integer fees) {
		   this.fees = fees;
	   }
	   
	   
}
