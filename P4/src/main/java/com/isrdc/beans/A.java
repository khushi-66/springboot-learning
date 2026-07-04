package com.isrdc.beans;

import org.springframework.stereotype.Component;

@Component
public class A {
public A()
{
	System.out.println("A()");
}

public void process()
{
	B x=new B();
	x.info();
}
}
