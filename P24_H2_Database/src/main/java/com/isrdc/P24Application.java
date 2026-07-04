package com.isrdc;

import com.isrdc.repos.StudentRepo;
import com.isrdc.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class P24Application {

    private final StudentService studentService;

    private final StudentRepo studentRepo;

    P24Application(StudentRepo studentRepo, StudentService studentService) {
        this.studentRepo = studentRepo;
        this.studentService = studentService;
    }

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(P24Application.class, args);
    StudentService serv= context.getBean(StudentService.class);
    serv.saveStudent();
	}

}
