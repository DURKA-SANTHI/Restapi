package com.example.springapp.onetomany.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.springapp.onetomany.model.Author;

public interface AuthorRepo extends JpaRepository<Author,Long>{


    @Query(value="select * from author a join book b on a.author_id=b.authod_id where a.author_name=?1 ",nativeQuery=true)
    List<Author>getByAuthorName(String authorName);
    
}
