package com.isrdc.entities;


import org.springframework.data.redis.core.RedisHash;

@RedisHash("cityHash")
public class City {
private Integer id;
private String city;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}


}
