package com.example.springapp.onetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springapp.onetomany.model.Book;

public interface BookRepo extends JpaRepository<Book,Long>{

    

    
}
