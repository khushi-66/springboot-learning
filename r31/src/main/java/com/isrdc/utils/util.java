package com.isrdc.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="app")
public class util {
private List<String>dholakpur=new ArrayList<>();

public List<String> getDholakpur() {
	return dholakpur;
}

public void setDholakpur(List<String> dholakpur) {
	this.dholakpur = dholakpur;
}
}
	
