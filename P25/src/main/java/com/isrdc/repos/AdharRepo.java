package com.isrdc.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isrdc.entities.Adhaar;

public interface AdharRepo   extends JpaRepository<Adhaar, Integer> {

}
