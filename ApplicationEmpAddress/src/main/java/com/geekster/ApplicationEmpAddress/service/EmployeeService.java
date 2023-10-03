package com.geekster.ApplicationEmpAddress.service;

import com.geekster.ApplicationEmpAddress.model.Employee;
import com.geekster.ApplicationEmpAddress.repo.IAddressRepo;
import com.geekster.ApplicationEmpAddress.repo.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    IEmployeeRepo employeeRepo;

    public String addEmployee(Employee newEmployee) {
        employeeRepo.save(newEmployee);
        return "Employee Created Successfully";
    }

    public List<Employee> getAllEmployee() {
        return employeeRepo.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return employeeRepo.findById(id).get();
    }

    public String updateEmployeeById(Long id,Employee newEmployee) {
        Optional<Employee> employee=employeeRepo.findById(id);
        if(employee.isPresent()){
            employeeRepo.save(newEmployee);
            return "updated";
        }else return "Employee not exist ";
    }

    public String deleteEmployeeById(Long id) {
        employeeRepo.deleteById(id);
        return "deleted successfully";
    }
}
