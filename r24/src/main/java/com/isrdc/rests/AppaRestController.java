package com.isrdc.rests;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isrdc.exceptions.excepInfo;

@RestController
public class AppaRestController {
@GetMapping("/pro")
	public String process() {
		System.out.println("pro start..........");
		int y=90/0;
		
		
		System.out.println("pro end..........");
		return "done.......";
	}

@GetMapping("/act")
public String action() {
	System.out.println("act start..........");
	int[] y= {12,34,5,4};
	
	
	System.out.println("act end.........."+ y[5]);
	return "done.......";
}

//@ExceptionHandler(exception=ArithmeticException.class)
//public ResponseEntity<excepInfo> arithmeticHandler() {
//	excepInfo ex=new excepInfo();
//	ex.setCode("Ex2398");
//	ex.setDesc("some problm.....");
//	ex.setDateTime(LocalDateTime.now());
//	return new ResponseEntity<>(ex,HttpStatus.BAD_REQUEST);
//	
//}
}
