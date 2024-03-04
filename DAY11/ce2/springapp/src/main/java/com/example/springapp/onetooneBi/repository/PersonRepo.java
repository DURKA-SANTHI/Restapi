package com.example.springapp.onetooneBi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springapp.onetooneBi.model.Person;

public interface PersonRepo extends JpaRepository<Person,Long>{

    

    
}
