package com.isrdc.services;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isrdc.dtos.UserDto;
import com.isrdc.entities.User;
import com.isrdc.repos.UserRepo;

@Service
public class UserService {
@Autowired
private UserRepo repo;

public void  saveUser(UserDto dto) {
	User u=new User();
	 BeanUtils.copyProperties(dto, u);
	repo.save(u);
}

public List<UserDto> showAllUser() {
	List<User>users= repo.findAll();
	 ArrayList<UserDto>list=new ArrayList<UserDto>();
	 
	 for(User next:users) {
		 UserDto udto=new UserDto();
		 BeanUtils.copyProperties(next, udto);
		 list.add(udto);
	 }
	return list;
}


public void  deleteUser(Integer id) {
	
	repo.deleteById(id);
}
}
