package com.isrdc.rests;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.multipart.MultipartFile;

@Controller
public class AppRestController {
@GetMapping("/save")
	public String saveFile( @RequestParam("pic") MultipartFile file) throws IOException {
		String filename=file.getOriginalFilename();
Path path = Paths.get("uploads" + File.separator + filename);
		
		Files.write(path, file.getBytes());
				
		return "The File " + filename + " is uploaded...";
	}



}
