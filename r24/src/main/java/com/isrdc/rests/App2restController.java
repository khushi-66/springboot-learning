package com.isrdc.rests;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isrdc.exceptions.excepInfo;

@RestController
public class App2restController {

	@GetMapping("/mno")
	public String process() {
		System.out.println("mno start..........");
		int y=90/0;
		
		
		System.out.println("mno end..........");
		return "done.......";
	}
//	
//	@ExceptionHandler(exception=ArithmeticException.class)
//	public ResponseEntity<excepInfo> arithmeticHandler() {
//		excepInfo ex=new excepInfo();
//		ex.setCode("Ex2398");
//		ex.setDesc("some problm.....");
//		ex.setDateTime(LocalDateTime.now());
//		return new ResponseEntity<>(ex,HttpStatus.BAD_REQUEST);
//		
//	}
}
