package com.isrdc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.isrdc.models.Employee;

@Service
public class EmployeeService {
   @Value("${topic.name}")
	private String topicname;
   @Autowired
KafkaTemplate<String, Employee> kafkaTemplate;
   
   public String postMessage(Employee employee) {
	   kafkaTemplate.send(topicname, "employee", employee);
	   
	   return"The Employee is posted to kafka broker.......";
   }
}
