package com.isrdc.rests;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isrdc.utils.Apputil;

@RestController
public class AppRestController {
	@Autowired
	private Apputil apputil;
@GetMapping("/pro")
	public String process() {
	Map<String,String>datasource=apputil.getDatasource();
	System.out.println(datasource.get("driver-class-name"));
	System.out.println(datasource.get("url"));
	System.out.println(datasource.get("password"));
	System.out.println(datasource.get("username"));
		return "done.....";
	}

}
