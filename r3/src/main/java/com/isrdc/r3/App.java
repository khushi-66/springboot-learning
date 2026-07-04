package com.isrdc.r3;


import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    //   toJson();
        fromJson();
    }
    
    public static void   toJson() {
    	Student s=new Student();
    	s.setAge(23);
    	s.setCollege("Global");
    	s.setMarks(89.56f);
    	s.setName("Om");
    	
    	ObjectMapper  om=new ObjectMapper();
    	try {
			om.writeValue(new File("bbb.json"), s);
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
			
    }
    
    public static void fromJson() {
    	ObjectMapper om=new ObjectMapper();
    	try {
		Student s=	om.readValue(new File("bbb.json"),Student.class);
		System.out.println(s.toString());
		} catch (IOException e) {
			
			e.printStackTrace();
		} 
    }
}
