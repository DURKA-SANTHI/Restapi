package com.example.springapp.onetooneBi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.onetooneBi.model.Person;
import com.example.springapp.onetooneBi.repository.PersonRepo;

@Service
public class PersonService {
    @Autowired
    PersonRepo personRepo;
    public Person addDetails(Person person)
    {
        return personRepo.save(person);
    }
    public List<Person> getDetails()
    {
        return personRepo.findAll();
    }

    
}
