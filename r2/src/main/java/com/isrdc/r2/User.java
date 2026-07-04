package com.isrdc.r2;

public class User {
private String name;
private Integer age;

@Override
public String toString() {
	return "User [name=" + name + ", age=" + age + ", getName()=" + getName() + ", getAge()=" + getAge()
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}


}
