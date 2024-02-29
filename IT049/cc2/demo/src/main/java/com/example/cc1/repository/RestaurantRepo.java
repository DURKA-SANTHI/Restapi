package com.example.cc1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cc1.model.Restaurant;



@Repository
public interface RestaurantRepo extends JpaRepository<Restaurant,Long>
{
    
}
