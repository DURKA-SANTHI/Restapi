package com.example.springapp.onetooneBi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.onetooneBi.model.Person;
import com.example.springapp.onetooneBi.service.PersonService;

@RestController
public class PersonController {
    @Autowired
    PersonService personService;
    @PostMapping("/api/person/post")
    public Person addDetails(@RequestBody Person person)
    {
        return personService.addDetails(person);
    }
    @GetMapping("/api/person/get")
    public List<Person> getDetails()
    {
        return personService.getDetails();
    }
    
}
