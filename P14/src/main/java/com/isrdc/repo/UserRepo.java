package com.isrdc.repo;

import org.springframework.data.repository.CrudRepository;

import com.isrdc.entities.User;

public interface UserRepo extends CrudRepository<User, Integer> {

}
