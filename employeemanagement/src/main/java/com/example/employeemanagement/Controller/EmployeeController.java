package com.example.employeemanagement.Controller;

import com.example.employeemanagement.Model.Employee;
import com.example.employeemanagement.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/employees")
    public void saveEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
    }

    @GetMapping("/employees")
    public List<Employee> readAllEmployees() {
        List<Employee> list = employeeService.findAllEmployees();
        return list;
    }

}
