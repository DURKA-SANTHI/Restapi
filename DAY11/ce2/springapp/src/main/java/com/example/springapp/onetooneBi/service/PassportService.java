package com.example.springapp.onetooneBi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.onetooneBi.model.Passport;
import com.example.springapp.onetooneBi.repository.PassportRepo;

@Service
public class PassportService {
    @Autowired
    PassportRepo passportRepo;
    public Passport addDetails(Passport passport)
    {
        return passportRepo.save(passport);
    }
    public List<Passport> getDetails()
    {
        return passportRepo.findAll();
    }
    
}
