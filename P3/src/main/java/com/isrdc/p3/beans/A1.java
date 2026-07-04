package com.isrdc.p3.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A1 {
	

	private B x;
	  
	
	

	public A1(B x)
{
	  this.x=x;
	System.out.println("A1");
	
}
public void process()
{
	x.info();
}
}
