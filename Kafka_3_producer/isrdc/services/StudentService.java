package com.isrdc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.isrdc.models.Student;

@Service
public class StudentService {
	@Value("${topic.name}")
	private String topicName;
	@Value("${topic.partition}")
	private Integer topicPartition;
	@Autowired
private KafkaTemplate<String, Student>kafkaTemplate;

	public String postMessage(Student student) {
		kafkaTemplate.send(topicName,3,"student",student);  //3 -> partition
		return "Stuent record s posted on kafka server...";
	}

}
