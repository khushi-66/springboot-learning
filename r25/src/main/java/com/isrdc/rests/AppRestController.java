package com.isrdc.rests;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.isrdc.dtos.UserDto;
import com.isrdc.exceptions.ExcepInfo;
import com.isrdc.exceptions.UnIdentifiedUserException;

@RestController
public class AppRestController {

	@GetMapping("/pro")
	public ResponseEntity<UserDto> process(@RequestParam Integer userId) {
		if(userId>100) {
			throw new UnIdentifiedUserException("User with given id  does not exist ....");
		}
		
		UserDto dto=new UserDto();
		dto.setAddress("Yampuri");
		dto.setEmail("yam@gmail.com");
		dto.setName("yamraj");
		dto.setPhone("837547508");
			
		return new ResponseEntity<UserDto>(dto,HttpStatus.OK);
	}
	@ExceptionHandler(exception=UnIdentifiedUserException.class)
	public ResponseEntity<ExcepInfo> ExcepHandler(UnIdentifiedUserException excep) {
		ExcepInfo ex=new ExcepInfo();
	ex.setCode("Ex3454");
		//ex.setDesc("some greater problm.....");           
		ex.setDateTime(LocalDateTime.now());
		ex.setDesc("The problm "+ excep.getMessage());
		return new ResponseEntity<>(ex,HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
