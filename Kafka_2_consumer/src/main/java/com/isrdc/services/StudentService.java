package com.isrdc.services;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import com.isrdc.models.Student;

@Service
public class StudentService {

private String msg;
	
	@KafkaListener(id="abc",topicPartitions= {@TopicPartition (topic="${topic.name}" ,partitions = {"3"}) })
	public  void readMessage(@Payload Student student) {
		msg=student.toString();
	}
	public String getMsg() {
		return msg;
	}

}
