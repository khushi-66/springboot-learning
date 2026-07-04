package com.isrdc.rests;

import java.time.LocalDateTime;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isrdc.exceptions.ExcepInfo;

@RestController
public class AppRestController {

	@GetMapping("/pro")
	public String process() {
		System.out.println("pro start........");
		int[] x= {12,34,14};
		System.out.println(x[3]);
		System.out.println("pro end........");
		return " done.......";
	}
	
	@GetMapping("/info")
	public String info() {
		System.out.println("info start........");
		String x= "ram";
		System.out.println(x.charAt(3));
		System.out.println("info end........");
		return " done.......";
	}
	
	@ExceptionHandler(exception=IndexOutOfBoundsException.class)
	public ExcepInfo IndexHandler(){
		ExcepInfo ex=new ExcepInfo();
		ex.setCode("Ex1235");
		ex.setDateTime(LocalDateTime.now());
		ex.setDesc("some Index Related Problm");
		return ex;
	}
	@ExceptionHandler(exception=ArrayIndexOutOfBoundsException.class)
	public   static ExcepInfo arrayHandler(){
		ExcepInfo ex=new ExcepInfo();
		ex.setCode("Ex1234");
		ex.setDateTime(LocalDateTime.now());
		ex.setDesc("some Array Related Problm");
		return ex;
	}
	
	

}
