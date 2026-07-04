package com.isrdc.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isrdc.entites.Taxpayer;


public interface TaxpayerRepo   extends JpaRepository<Taxpayer, Integer> {

}
