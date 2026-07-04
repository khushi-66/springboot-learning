package com.isrdc.r2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

public class Test1 {
	
	public static void fromJson() {
		try {
			
		
		Gson gson=new Gson();
		FileReader filereader=new FileReader("jiyan.json");
	User user=	gson.fromJson(filereader,User.class);
	System.out.println(user.toString());
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
			
public static void toJson()  {
	User user=new User();
    user.setAge(9);
    user.setName("vignesh");
    Gson gson= new Gson();
    try {
    	FileWriter file=new FileWriter("aaa.json");
        gson.toJson(user,file);
        file.close();
    }catch(IOException e) {
    	e.printStackTrace();
    }
    
}
}
