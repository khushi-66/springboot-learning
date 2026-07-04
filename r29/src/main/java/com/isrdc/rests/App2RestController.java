package com.isrdc.rests;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isrdc.utils.AppUtility;
import com.isrdc.utils.AppUtility2;
@RestController
public class App2RestController {
@Autowired
private AppUtility apputil;
@Autowired
private AppUtility2 apputil2;
//	@Value("${server.port}")
//	private String serverPort;
@GetMapping("/info")
	public   String info() {
	
	System.out.println(apputil.getPort());
	System.out.println(apputil2.getPassword());
	System.out.println(apputil2.getDriverClassName());
	System.out.println(apputil2.getUserName());
	System.out.println(apputil2.getUrl());
		return "done....";
	}

}
