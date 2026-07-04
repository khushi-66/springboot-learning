package com.isrdc.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;

import com.isrdc.entities.Student;

import jakarta.transaction.Transactional;

public interface StudentRepo    extends JpaRepository<Student, Integer> {

	@Transactional()
    @Modifying
    @Query(value="update students set name=:name , degree=:degree,fees=:fees ,college=:college,marks=:marks where student_id=:studentId",nativeQuery=true)
	public void updateStudent(Integer studentId, String name,   String college,  Float marks,  String degree, Integer fees );

	
}
