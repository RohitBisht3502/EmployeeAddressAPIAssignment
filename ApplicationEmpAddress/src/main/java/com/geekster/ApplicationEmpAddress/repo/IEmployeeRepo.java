package com.geekster.ApplicationEmpAddress.repo;

import com.geekster.ApplicationEmpAddress.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeeRepo extends JpaRepository<Employee,Long> {
}
