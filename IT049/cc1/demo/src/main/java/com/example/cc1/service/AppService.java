package com.example.cc1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cc1.model.Reg;
import com.example.cc1.model.Restaurant;
import com.example.cc1.repository.RegRepo;
import com.example.cc1.repository.RestaurantRepo;

@Service
public class AppService {

     @Autowired
     RegRepo regrepo;
     
     public Reg AddReg(Reg reg)
     {
         return regrepo.save(reg);
        }
        
        public List<Reg> getReg()
        {
            return regrepo.findAll();
        }

    public Optional<Reg> getRegById(Long userId)
    {
        return regrepo.findById(userId);
    }

    public Reg editReg(Long userId,Reg reg)
    {
        Reg RegAvail = regrepo.findById(userId).orElse(null);
        if(RegAvail !=null)
        {    
              RegAvail.setUserid(reg.getUserid());
              RegAvail.setUserName(reg.getUserName());
              RegAvail.setUserEmail(reg.getUserEmail());
              RegAvail.setUserPassword(reg.getUserPassword());
              RegAvail.setUserConfirmPassword(reg.getUserConfirmPassword());
             return regrepo.saveAndFlush(RegAvail);
        }
        else
        return null;
    }

    public void delReg(Long userId)
    {
         regrepo.deleteById(userId);
    }
    
    
    @Autowired
    RestaurantRepo resrepo;
    
    public Restaurant AddRes(Restaurant res)
    {
        return resrepo.save(res);
    }

    public List<Restaurant> getRestaurant()
    {
        return resrepo.findAll();
    }
    public Optional<Restaurant> getResById(Long RestaurantId)
    {
        return resrepo.findById(RestaurantId);
    }

    public Restaurant editRes(Long RestaurantId,Restaurant res)
    {
         Restaurant ResAvail = resrepo.findById(RestaurantId).orElse(null);
        if(ResAvail !=null)
        {    
              ResAvail.setRestaurantId(res.getRestaurantId());
              ResAvail.setRestaurantName(res.getRestaurantName());
              ResAvail.setRestaurantCode(res.getRestaurantCode());
              ResAvail.setRestaurantLoc(res.getRestaurantLoc());
              ResAvail.setTypeofVarities(res.getTypeofVarities());
              ResAvail.setCuisine(res.getCuisine());
             return resrepo.saveAndFlush(ResAvail);
        }
        else
        return null;
    }

    public void delRes(Long RestaurantId)
    {
         regrepo.deleteById(RestaurantId);
    }


}
