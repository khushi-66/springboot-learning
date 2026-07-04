package com.isrdc.beans;

import org.springframework.stereotype.Component;

@Component
public class Abean {
    public Abean() {
    	System.out.println("Abean instanciated.....");
    	
    }
    
    public void showInfo() {
    	
    	System.out.println("showinfo executed....");
    	
    }
}
