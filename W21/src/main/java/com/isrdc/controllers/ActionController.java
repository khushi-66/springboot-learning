package com.isrdc.controllers;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class ActionController {
	@Value("${user.dir}/uploads")
	 private String uploadPath; 
	
@PostMapping("/upload")
public String fileUpload(MultipartFile pic) {
	if (pic.isEmpty()) {
        System.out.println("No file selected");
        
    }
	System.out.println(uploadPath);
	String fileName=pic.getOriginalFilename();
	File file=new File(uploadPath);
	if(!file.exists()) {
		file.mkdirs();}
	Path uppath=	Paths.get(uploadPath);
	Path actualUploadPath=uppath.resolve(fileName);
	System.out.println(  "filename : "+fileName  +  "   actualUploadPath  : "+ actualUploadPath);
	try {
		Files.copy(pic.getInputStream(),actualUploadPath,StandardCopyOption.REPLACE_EXISTING);
	}catch(IOException e) {
		e.printStackTrace();
	}
	
	return "index";
}
}
