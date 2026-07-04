package com.isrdc.p3.beans;

import org.springframework.stereotype.Service;

@Service
public class B {
   public B() {
	   System.out.println("B()");
   }
   
   public  void info()
   {
	  System.out.println("hello info.....") ;
   }
}
