package com.isrdc.repo;

import org.springframework.data.repository.CrudRepository;

import com.isrdc.entities.User;

public interface userRepo extends CrudRepository<User, Integer> {

}
