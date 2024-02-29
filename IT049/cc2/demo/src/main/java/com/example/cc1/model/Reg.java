package com.example.cc1.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Regs")
public class Reg {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long userid;
    String userName;
    String userEmail;
    String userPassword;
    String userConfirmPassword;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="resid")
    List<Restaurant> restaurants =new ArrayList<>();


    public Long getUserid() {
        return userid;
    }


    public void setUserid(Long userid) {
        this.userid = userid;
    }


    public String getUserName() {
        return userName;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getUserEmail() {
        return userEmail;
    }


    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }


    public String getUserPassword() {
        return userPassword;
    }


    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }


    public String getUserConfirmPassword() {
        return userConfirmPassword;
    }


    public void setUserConfirmPassword(String userConfirmPassword) {
        this.userConfirmPassword = userConfirmPassword;
    }


    public List<Restaurant> getRestaurants() {
        return restaurants;
    }


    public void setRestaurants(List<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }


 
   
}
