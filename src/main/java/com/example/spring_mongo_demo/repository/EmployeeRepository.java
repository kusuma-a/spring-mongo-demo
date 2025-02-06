package com.example.spring_mongo_demo.repository;

import com.example.spring_mongo_demo.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee,String> {
    Employee findByEmployeeId(String employeeId);

}
