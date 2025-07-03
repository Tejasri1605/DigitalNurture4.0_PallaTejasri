package com.example.difference.service;

import com.example.difference.entity.Employee;
import com.example.difference.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    public void addEmployee(Employee emp) {
        repo.save(emp);
    }

    public void listEmployees() {
        repo.findAll().forEach(System.out::println);
    }
}
