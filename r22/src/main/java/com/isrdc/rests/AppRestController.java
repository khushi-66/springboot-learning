package com.isrdc.rests;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isrdc.exceptions.ExceptionInfo;

@RestController
public class AppRestController {
     @GetMapping("/pro")
	public String process() {
		System.out.println(" process start......");
		int y=12/0;
		System.out.println(" process end......");
		
		
		return "done...";
	}
     
     @GetMapping("/info")
 	public String info() {
 		System.out.println(" info start......");
 		int y=20/0;
 		System.out.println(" info end......");
 		
 		
 		return "done...";
 	}
     @ExceptionHandler(exception=ArithmeticException.class)
     public ResponseEntity<ExceptionInfo> arithexceptionHandler() {
    	 ExceptionInfo ex=new ExceptionInfo();
    	 ex.setExceptionCode("Ex0013");
    	 ex.setDescription("some problm");
    	 ex.setExcepdateTime(LocalDateTime.now());
    	 return new ResponseEntity<>(ex,HttpStatus.INTERNAL_SERVER_ERROR);
     }

}
