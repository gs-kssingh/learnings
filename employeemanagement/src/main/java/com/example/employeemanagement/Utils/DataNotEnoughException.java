package com.example.employeemanagement.Utils;

public class DataNotEnoughException extends RuntimeException{
    public DataNotEnoughException() {
        super("Data provided is not enough to create new employee");
    }
}
