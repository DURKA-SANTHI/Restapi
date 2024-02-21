package com.example.cc1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.cc1.model.Reg;
import com.example.cc1.model.Restaurant;
import com.example.cc1.service.AppService;

@RestController
public class AppController {

    @Autowired
    AppService appservice;

    @PostMapping("/api/reg")
    public Reg AddReg(@RequestBody Reg reg)
    {    
        return appservice.AddReg(reg) ;
    }
    
    @GetMapping("/api/regs")
    public List<Reg> getReg()
    {
        return appservice.getReg();
    }

    @GetMapping("/api/reg/{userId}")
    public Optional<Reg> getRegById(@PathVariable Long userId)
    {
        return appservice.getRegById(userId);
    }

    @PutMapping("/api/editreg/{userId}")
    public Reg editReg(@PathVariable Long userId,@RequestBody Reg reg)
    {
        return appservice.editReg(userId,reg);
    }

    @DeleteMapping("/api/deletereg/{userId}")
    public void delReg(@PathVariable Long userId)
    {
       appservice.delReg(userId);
    }
    
    


    
    @PostMapping("/api/restaurant")
    public Restaurant AddRes(@RequestBody Restaurant res) {
        
        return appservice.AddRes(res);
    }
    
    @GetMapping("/api/restaurants")
    public List<Restaurant> getRestaurant() {
        return appservice.getRestaurant();
    }

    @GetMapping("/api/restaurants/{RestaurantId}")
    public Optional<Restaurant> getResById(@PathVariable Long RestaurantId) {
        return appservice.getResById(RestaurantId);
    }
    @PutMapping("/api/editres/{RestaurantId}")
    public Restaurant editRes(@PathVariable Long RestaurantId,@RequestBody Restaurant res)
    {
        return appservice.editRes(RestaurantId,res);
    }
    @DeleteMapping("/api/deleteres/{userId}")
    public void delRes(@PathVariable Long RestaurantIdId)
    {
       appservice.delRes(RestaurantIdId);
    }
}
