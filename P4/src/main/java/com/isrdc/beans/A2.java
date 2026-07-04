package com.isrdc.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A2 {
    private B x;
    @Autowired       //Mandatory
     public void setB(B x)
    {   System.out.println("#######################");
         this.x=x;
    }
    
    public void process()
    {
    	x.info();
    }
}
