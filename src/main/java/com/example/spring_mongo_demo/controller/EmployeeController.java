package com.example.spring_mongo_demo.controller;

import com.example.spring_mongo_demo.entity.Employee;
import com.example.spring_mongo_demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;

@Controller
public class EmployeeController {
        @Autowired
        private EmployeeService employeeService;

        @GetMapping("/")
        public String showForm(Model model){
            model.addAttribute("employee",new Employee("","","",""));
            return "index";
        }

        @PostMapping("/addEmployee")
        public String addEmployee(@ModelAttribute Employee employee){
            employeeService.saveEmployee(employee);
            return "redirect:/displayAll";
        }
        @GetMapping("/displayAll")
        public String displayAllEmployees(Model model){
            List<Employee> employees =employeeService.getAllEmployees();
            model.addAttribute("employees",employees);
            return "displayAll";
        }
        @GetMapping("/display/{employeeId}")
        public String displayEmployee(@PathVariable String employeeId, Model model){
            Employee employee = employeeService.getEmployeeById(employeeId);
            if(employee != null){
                model.addAttribute("employee",employee);
                return "displayEmployee";
            }
            return "employeeNotFound";
        }
    }





