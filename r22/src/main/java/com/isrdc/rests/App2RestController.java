package com.isrdc.rests;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isrdc.exceptions.ExceptionInfo;

@RestController
public class App2RestController {

	@GetMapping("/act")
	public String action() {
		System.out.println(" act start......");
		int y=12/0;
		System.out.println(" act end......");
		
		
		return "done...";
	}
	
	//class level ExceptionHandler Method  
	//not working  for other controller class

	@ExceptionHandler(exception=ArithmeticException.class)
    public ResponseEntity<ExceptionInfo> arithexceptionHandler() {
   	 ExceptionInfo ex=new ExceptionInfo();
   	 ex.setExceptionCode("Ex0013");
   	 ex.setDescription("some problm");
   	 ex.setExcepdateTime(LocalDateTime.now());
   	 return new ResponseEntity<>(ex,HttpStatus.INTERNAL_SERVER_ERROR);
    }
	
	@ExceptionHandler(exception=NullPointerException.class)
    public ResponseEntity<ExceptionInfo> nullpointerexceptionHandler() {
   	 ExceptionInfo ex=new ExceptionInfo();
   	 ex.setExceptionCode("Ex0014");
   	 ex.setDescription("some  more problm");
   	 ex.setExcepdateTime(LocalDateTime.now());
   	 return new ResponseEntity<>(ex,HttpStatus.INTERNAL_SERVER_ERROR);
    }
	@GetMapping("/abc")
	public String abc() {
		System.out.println(" abc start......");
		String str=null;
		System.out.println(str.length());
		System.out.println(" abc  end......");
		
		return "done...";
	}
}
