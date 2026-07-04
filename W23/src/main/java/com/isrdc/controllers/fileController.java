package com.isrdc.controllers;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
@Controller
public class fileController {
	@Value("${user.dir}/uploads")
	private String uploadPath;
@PostMapping("/save_user")
public String fileupload(   @RequestParam("files")MultipartFile[] files) {
	File file=new File(uploadPath);
	if(!file.exists()) {
		file.mkdirs();}
	for(MultipartFile next:files) {
		String filename=next.getOriginalFilename();
		try {
			InputStream filestream=next.getInputStream();
			Path path= Paths.get(uploadPath).resolve(filename);
			Files.copy(filestream, path, StandardCopyOption.REPLACE_EXISTING);
		}catch(IOException e) {
			
			e.printStackTrace();}}
	
	
	
	
	
	return "index";
	
}
}
