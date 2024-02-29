package com.example.cc1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.cc1.model.Reg;
import com.example.cc1.repository.RegRepo;

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


    public List<Reg> page(int pn,int ps)
  {
    PageRequest page=PageRequest.of(pn,ps);
    return regrepo.findAll(page).getContent();
  }
  public List<Reg> sort1(String field)
  {
    Sort sort=Sort.by(Sort.Direction.ASC,field);
    return regrepo.findAll(sort);
  }

  public List<Reg> getpagesort(int pn,int ps,String field)
  {
    return regrepo.findAll(PageRequest.of(pn,ps).withSort(Sort.by(Sort.Direction.ASC,field))).getContent();
  }
    /*   

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
    public Optional<Restaurant> getResById(Long restaurantId)
    {
        return resrepo.findById(restaurantId);
    }

    public Restaurant editRes(Long restaurantId,Restaurant res)
    {
         Restaurant ResAvail = resrepo.findById(restaurantId).orElse(null);
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

    public void delRes(Long restaurantId)
    {
         resrepo.deleteById(restaurantId);
    }
*/

}
