package com.example.cc1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.cc1.model.Reg;
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
    
    @GetMapping("/api/reg")
    public List<Reg> getReg()
    {
        return appservice.getReg();
    }

    @GetMapping("/api/reg/{userId}")
    public Optional<Reg> getRegById(@PathVariable Long userId)
    {
        return appservice.getRegById(userId);
    }

    @GetMapping("/api/reg/{pn}/{ps}")
    public List<Reg> getpage(@PathVariable int pn,@PathVariable int ps)
    {
        return appservice.page(pn,ps);
    }
    @GetMapping("/sorting/{field}")
    public List<Reg> getsort(@PathVariable String field)
    {
        return appservice.sort1(field);
    }
    @GetMapping("/api/reg/{pn}/{ps}/{field}")
    public List<Reg> getpagesort(@PathVariable int pn,@PathVariable int ps,@PathVariable String field)
    {
        return appservice.getpagesort(pn,ps,field);
    }

   /*  @PutMapping("/api/editreg/{userId}")
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

    @GetMapping("/api/restaurants/{restaurantId}")
    public Optional<Restaurant> getResById(@PathVariable Long restaurantId) {
        return appservice.getResById(restaurantId);
    }
    @PutMapping("/api/editres/{restaurantId}")
    public Restaurant editRes(@PathVariable Long restaurantId,@RequestBody Restaurant res)
    {
        return appservice.editRes(restaurantId,res);
    }
    @DeleteMapping("/api/deleteres/{restaurantid}")
    public void delRes(@PathVariable Long restaurantid)
    {
       appservice.delRes(restaurantid);
    }
    */
}
