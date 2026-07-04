package com.isrdc.rests;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.isrdc.dtos.UserDto;

import com.isrdc.services.UserService;

@RestController
public class UserRestController {
	
	
    //  #######################   CRUD Operation ##########################
	@Autowired
	private UserService serv;
	
	//  ###################   Create  #######################
	@PostMapping("/save")
	public String saveUser(@RequestBody UserDto dto) {
		serv.saveUser(dto);
		return "Record Saved.....";
	}
	
//  ####################  Read  #######################
	@GetMapping("/showAll")
	public List<UserDto> showAllUser() {
		List<UserDto>list=serv.showAllUser();
		return list;
	}
	
//	####################  Update  #######################
	@PutMapping("/update")
	public String UpdateUser(@RequestBody UserDto dto) {
		serv.saveUser(dto);
		return "Record updated.....";
	}

//  ####################   Delete  #######################
	@DeleteMapping("/delete/{id}")
	public String deleteUser( @PathVariable("id")Integer id) {
		System.out.println(id);
		serv.deleteUser(id);
	   return "Record Deleted....";
	}
	
}
