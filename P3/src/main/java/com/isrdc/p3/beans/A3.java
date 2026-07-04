package com.isrdc.p3.beans;

import org.springframework.stereotype.Component;

@Component
public class A3 {
   private B x;

   public A3() {
	   System.out.println("A3()");
   }
   
   public A3(B x) {
	   this.x=x;
	   System.out.println("A3(B)");
   }
   
   public void process()
   {
	   x.info();
   }
}
//Exception in thread "main" java.lang.NullPointerException: Cannot invoke "com.isrdc.p3.beans.B.info()" because "this.x" is null
//at com.isrdc.p3.beans.A3.process(A3.java:19)
//at com.isrdc.p3.P3Application.main(P3Application.java:24)