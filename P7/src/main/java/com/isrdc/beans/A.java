package com.isrdc.beans;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class A {
	@PreDestroy
	
	public void end() {
		System.out.println("end method....");
	}
	@PostConstruct
	public void start()
	{
		System.out.println("start method.....");
	}
			
public void doWork()
{
	System.out.println("Hello...");
}
}
