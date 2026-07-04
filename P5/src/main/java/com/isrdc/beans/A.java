package com.isrdc.beans;

import org.springframework.stereotype.Component;

@Component
public class A {
	
  private B x;
  public void process()
  {
	System.out.println("process.......");
	x.info();
  }
}
//Exception in thread "main" java.lang.NullPointerException: Cannot invoke "com.isrdc.beans.B.info()" because "this.x" is null
//at com.isrdc.beans.A.process(A.java:12)
//at com.isrdc.P5Application.main(P5Application.java:12)
