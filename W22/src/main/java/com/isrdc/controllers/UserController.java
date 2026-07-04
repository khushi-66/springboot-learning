package com.isrdc.controllers;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UserController {
	@Value("${user.dir}/Uploads")
	private String uploadPath;
@PostMapping("/save_user")
public String saveUser(String name,MultipartFile pic) {
	String filename=pic.getOriginalFilename();
	System.out.println(name);
	 System.out.println(pic.getOriginalFilename()+   "    "+uploadPath );
	 File file=new File(uploadPath);
	 if(!file.exists()) {
		 file.mkdirs();
	 }
	 Path path=Paths.get(uploadPath);
	 Path ppath=path.resolve(filename);
	 
	 try 
	 {
		  Files.copy(pic.getInputStream(), ppath, StandardCopyOption.REPLACE_EXISTING);
	 
	 }
	 catch(IOException e) {
		 e.printStackTrace();
	 }
	return "index";
}
}
