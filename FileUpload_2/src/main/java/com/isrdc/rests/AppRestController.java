package com.isrdc.rests;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class AppRestController {
	 @Value("${file.upload.directory}")
		private String uploadDirectory;
    @PostMapping("/upload")
	public String upload(@RequestParam("pic") MultipartFile[] files) throws IOException{
    	for(MultipartFile file:files) {
    	String filename=file.getOriginalFilename();
    	Path path=Paths.get( uploadDirectory+File.separator+filename);
    	System.out.println(path);
    	Files.write(path, file.getBytes());}
		return"Files uploaded.....";
	}

}
