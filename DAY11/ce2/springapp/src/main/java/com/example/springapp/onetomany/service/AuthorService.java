package com.example.springapp.onetomany.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.onetomany.model.Author;
import com.example.springapp.onetomany.repository.AuthorRepo;

@Service
public class AuthorService {
    @Autowired
    AuthorRepo authorRepo;
    public Author addDetails(Author author)
    {
       return authorRepo.save(author);
    }
    public List<Author> getDetails()
    {
        return authorRepo.findAll();
    }
    public List<Author>getByAuthorName(String authorName)
    {
        return authorRepo.getByAuthorName(authorName);
    }
}
