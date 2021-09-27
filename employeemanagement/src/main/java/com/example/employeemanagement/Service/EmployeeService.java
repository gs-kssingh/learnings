package com.example.employeemanagement.Service;

import com.example.employeemanagement.Model.Employee;
import com.example.employeemanagement.Repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo empRepo;

    public void saveEmployee(Employee req) {
        empRepo.save(req);
    }

    public List<Employee> findAllEmployees() {
        List<Employee> list = empRepo.findAll();
        return list;
    }
}
