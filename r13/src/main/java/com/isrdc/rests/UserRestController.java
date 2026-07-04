package com.isrdc.rests;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.isrdc.dtos.UserDto;

@RestController
public class UserRestController {
	
	@GetMapping(value="/show")
	public ArrayList<UserDto> showUsers() {
		ArrayList<UserDto> userDtos = new ArrayList<>();
		userDtos.add(new UserDto("om", "om@gmail.com", "8989786756", "Jabalpur", 27, 2.3f));
		userDtos.add(new UserDto("ram", "ram@gmail.com", "7856453423", "Bhopal", 32, 1.2f));
		userDtos.add(new UserDto("golu", "golu@isrdc.com", "6778564534", "Indore", 54, 7.9f));
		return userDtos;
	}
	
	@PostMapping(value="/save")
public String saveUser(@RequestBody UserDto dto) {
	System.out.println("Dto  :"+dto);
	return " Done ........."+ dto;
}
}
