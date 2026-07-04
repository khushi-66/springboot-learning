package com.isrdc.controllers;

import java.io.File;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ActionController {
	//private String path="./folder";
	@Value("${app.upload.dir}")
	private String uploadPath;
	
	@GetMapping("/")
public String process() {
//		File file= new File(path);
//		System.out.println(file.getAbsolutePath());
		new File(uploadPath).mkdirs();
		System.out.println(uploadPath);
	return "index";
}
		
}
