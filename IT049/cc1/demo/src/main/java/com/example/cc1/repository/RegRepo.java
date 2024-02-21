package com.example.cc1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cc1.model.Reg;

public interface RegRepo extends JpaRepository<Reg,Long> 
{
    
}
