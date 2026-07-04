package com.isrdc.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import com.isrdc.models.Employee;

@Service
public class EmployeeService {
private	String  message;

    @KafkaListener(topics="${topic.name}",groupId="demoGroup")
	public void readMessage(@Payload Employee em) {
		
		message= em.toString();
	
	}
    
    public String getMessage() {
    	
    	 return message;
    }
}
