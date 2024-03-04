package com.example.springapp.onetooneUni.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.onetooneUni.model.Employee;
import com.example.springapp.onetooneUni.service.EmployeeService;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @PostMapping("/api/employee/postdetails")
    public Employee addDetails(@RequestBody Employee employee)
    {
        return employeeService.addDetails(employee);
    }
    @GetMapping("/api/employee/getdetails")
    public List<Employee> getDetails()
    {
        return employeeService.getDetails();
    }
}
