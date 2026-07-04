package com.isrdc.p3.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A2 {
	private B x;
	@Autowired
  public A2(B x)
  {    System.out.println("A2(B)");
	   this.x=x;
  }
  public void process() {
	  x.info();
  }
}
