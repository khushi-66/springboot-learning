package com.isrdc.p3.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class A4 {
	 private B x;

	   public A4() {
		   System.out.println("A4()");
	   
	   }
	   
	   @Autowired
	    public A4(B x) {
		   this.x=x;
		   System.out.println("A4(B)");
	   }
	   
	   public void process()
	   {
		   x.info();
	   }
}
