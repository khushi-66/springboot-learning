package com.isrdc.Repos;

import org.springframework.data.repository.CrudRepository;

import com.isrdc.Entities.Users;

public interface UserRepo  extends CrudRepository<Users, Integer>{
  
}
