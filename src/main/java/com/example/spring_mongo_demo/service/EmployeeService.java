package com.example.spring_mongo_demo.service;

import com.example.spring_mongo_demo.entity.Employee;
import com.example.spring_mongo_demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(String employeeId){
        return employeeRepository.findByEmployeeId(employeeId);
    }
}
