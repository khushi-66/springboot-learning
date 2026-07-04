package com.isrdc.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A1{
	@Autowired
  private B x;
  public void process()
  {
	System.out.println("process.......");
	x.info();
  }
}