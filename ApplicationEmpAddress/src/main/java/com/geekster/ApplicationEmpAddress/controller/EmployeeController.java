package com.geekster.ApplicationEmpAddress.controller;

import com.geekster.ApplicationEmpAddress.model.Employee;
import com.geekster.ApplicationEmpAddress.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("Create/Employee")
    public String addEmployee(@RequestBody Employee newEmployee){
        return employeeService.addEmployee(newEmployee);
    }

    @GetMapping("Get/Employee")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }
    @GetMapping("Get/Employee/id/{id}")
    public Employee getEmployeeById(@PathVariable Long id){
       return employeeService.getEmployeeById(id);
    }
    @PutMapping("update/Employee/id/{id}")
    public String updateEmployeeById(@PathVariable Long id,@RequestBody Employee newEmployee){
        return employeeService.updateEmployeeById(id,newEmployee);
    }
    @DeleteMapping("delete/employee/id/{id}")
    public String deleteEmployeeById(@PathVariable Long id){
        return employeeService.deleteEmployeeById(id);
    }
}
