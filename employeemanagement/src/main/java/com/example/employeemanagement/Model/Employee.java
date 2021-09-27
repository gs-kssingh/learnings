package com.example.employeemanagement.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue     // by default its auto
    private int id;

    private String name;
    private String email;

    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
