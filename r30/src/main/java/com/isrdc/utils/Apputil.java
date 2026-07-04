package com.isrdc.utils;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("spring")
public class Apputil {
private Map<String, String> datasource=new HashMap<>();

public Map<String, String> getDatasource() {
	return datasource;
}

public void setDatasource(Map<String, String> datasource) {
	this.datasource = datasource;
}

	

}
