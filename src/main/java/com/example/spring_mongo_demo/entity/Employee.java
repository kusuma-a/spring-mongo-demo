package com.example.spring_mongo_demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "employees")
public class Employee {

        @Id
        private String id;
        private String employeeId;
        private String name;
        private String email;
        private String location;

        public Employee() {
        }

        public Employee(String email, String employeeId, String location, String name) {
            this.email = email;
            this.employeeId = employeeId;
            this.location = location;
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmployeeId() {
            return employeeId;
        }

        public void setEmployeeId(String employeeId) {
            this.employeeId = employeeId;
        }
    }



