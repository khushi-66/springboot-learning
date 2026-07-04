package com.isrdc.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
 public class AppExceptionHandler {

	@ExceptionHandler(exception=ArithmeticException.class)
	public ResponseEntity<excepInfo> arithmeticHandler() {
		excepInfo ex=new excepInfo();
		ex.setCode("Ex00457");
		ex.setDesc("some   arithmetic problm.....");
		ex.setDateTime(LocalDateTime.now());
		return new ResponseEntity<>(ex,HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(exception=ArrayIndexOutOfBoundsException.class)
	public ResponseEntity<excepInfo> arrayHandler() {
		excepInfo ex=new excepInfo();
		ex.setCode("Ex00458");
		ex.setDesc("some  aaray problm.....");
		ex.setDateTime(LocalDateTime.now());
		return new ResponseEntity<>(ex,HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(exception=IndexOutOfBoundsException.class)
	public ResponseEntity<excepInfo> indexHandler() {
		excepInfo ex=new excepInfo();
		ex.setCode("Ex00459");
		ex.setDesc("some  index problm.....");
		ex.setDateTime(LocalDateTime.now());
		return new ResponseEntity<>(ex,HttpStatus.BAD_REQUEST);
		
	}

}
