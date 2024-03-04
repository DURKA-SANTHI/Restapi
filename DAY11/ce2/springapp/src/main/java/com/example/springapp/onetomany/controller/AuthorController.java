package com.example.springapp.onetomany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.onetomany.model.Author;
import com.example.springapp.onetomany.service.AuthorService;

@RestController
public class AuthorController {
    @Autowired
    AuthorService authorService;
    @PostMapping("/api/author")
    public Author addDetails(@RequestBody Author a)
    {
        return authorService.addDetails(a);
    }
    @GetMapping("/api/author")
    public List<Author> getDetails()
    {
        return authorService.getDetails();
    }
    @GetMapping("/api/author/{value}")
    public List<Author> getByAuthorName(@PathVariable String value)
    {
        return authorService.getByAuthorName(value);
    }
    
}
