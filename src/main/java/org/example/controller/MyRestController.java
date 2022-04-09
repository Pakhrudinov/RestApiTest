package org.example.controller;

import org.example.entity.Employee;
import org.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRestController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees(){

        List<Employee> employees = employeeService.getAllEmployees();
        return employees;
    }

/*    @GetMapping("/employees")
    public String showAllEmployees(){

        List<Employee> employees = employeeService.getAllEmployees();
        return employees.toString();
    }*/
}
