package com.example.springapp.onetooneUni.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springapp.onetooneUni.model.Address;
@Repository
public interface  AddressRepo extends JpaRepository<Address,Long>{
    
}
