package com.example.spring_mongo_demo;

import com.example.spring_mongo_demo.entity.Employee;
import com.example.spring_mongo_demo.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class EmployeeData implements CommandLineRunner {
    private final EmployeeRepository employeeRepository;

    public EmployeeData(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args)  {
        employeeRepository.deleteAll();

        Employee emp1 = new Employee("k@gmail.com","1221","Hyderabad","Kusuma");
        Employee emp2 = new Employee("p@gmail.com","2112","bangalore","Priya");

        employeeRepository.saveAll(List.of(emp1,emp2));

        System.out.println("Sample employees");
    }
}
