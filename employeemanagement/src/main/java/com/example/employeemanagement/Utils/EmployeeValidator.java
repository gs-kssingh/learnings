package com.example.employeemanagement.Utils;

import com.example.employeemanagement.Model.Employee;

public class EmployeeValidator {
    public static boolean isValid(Employee employee) {
        if (employee.getName() == null || employee.getEmail() == null || employee.getName() == "" || employee.getEmail() =="")
            return false;
        return true;
    }
}
