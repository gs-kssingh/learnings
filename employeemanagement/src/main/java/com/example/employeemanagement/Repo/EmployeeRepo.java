package com.example.employeemanagement.Repo;

import com.example.employeemanagement.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
}
