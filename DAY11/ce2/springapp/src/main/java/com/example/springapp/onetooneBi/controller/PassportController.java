package com.example.springapp.onetooneBi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.onetooneBi.model.Passport;
import com.example.springapp.onetooneBi.service.PassportService;

@RestController
public class PassportController {
    @Autowired
    PassportService passportService;
    @PostMapping("/api/passport/post")
    public Passport addDetails(@RequestBody Passport p)
    {
        return passportService.addDetails(p);
    }
    @GetMapping("/api/passport/get")
    public List<Passport> getDetails()
    {
        return passportService.getDetails();
    }
    
}
