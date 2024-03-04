package com.example.springapp.onetooneUni.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.onetooneUni.model.Employee;
import com.example.springapp.onetooneUni.repository.EmployeeRepo;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;
    public Employee addDetails(Employee employee)
    {
        return employeeRepo.save(employee);
    }
    public List<Employee>getDetails()
    {
        return employeeRepo.findAll();
    }
    
}
