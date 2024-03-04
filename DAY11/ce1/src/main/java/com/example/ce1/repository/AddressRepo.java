package com.example.ce1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ce1.model.Address;

public interface AddressRepo extends JpaRepository<Address,Long>{

    
}