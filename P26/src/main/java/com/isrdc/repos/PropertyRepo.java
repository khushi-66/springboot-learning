package com.isrdc.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isrdc.entites.Property;

public interface PropertyRepo   extends JpaRepository<Property, Integer>{

}
