package com.isrdc.beans;

import org.springframework.stereotype.Component;

@Component
public class A1 {
   private B x;
   public void setB(B x)
   {    System.out.println(".....A1()..............");
	   this.x=x;
   }
   public void process()
   {
	   x.info();
   }
   
}
//Exception in thread "main" java.lang.NullPointerException: Cannot invoke "com.isrdc.beans.B.info()" because "this.x" is null
//at com.isrdc.beans.A1.process(A1.java:14)
//at com.isrdc.P4Application.main(P4Application.java:12)
