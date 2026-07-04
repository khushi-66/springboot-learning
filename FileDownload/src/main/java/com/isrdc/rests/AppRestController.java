package com.isrdc.rests;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class AppRestController {
	
	@GetMapping("/download")
	public ResponseEntity<byte[]> downloadFile() throws IOException {
		Path path = Paths.get("uploads" + File.separator + "marksheets.pdf");
		
		byte[] arr = Files.readAllBytes(path);
		
		HttpHeaders headers = new HttpHeaders();
		headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=jiyan.png");
		
		return ResponseEntity.ok().headers(headers).body(arr);
	}
	
	@GetMapping("/upload")
	public String saveFile( @RequestParam("pic") MultipartFile file) throws IOException {
		String filename=file.getOriginalFilename();
Path path = Paths.get("uploads" + File.separator + filename);
		
		Files.write(path, file.getBytes());
				
		return "The File " + filename + " is uploaded...";
	}
}
