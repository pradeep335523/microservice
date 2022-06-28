package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Employee;
import com.example.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@PostMapping(value = "employee")
	public Employee employee(@RequestBody Employee employee) {
		// Store employee and return instance back to service
		service.addEmployee(employee);
		return employee;
	}

	@GetMapping(value = "employee/{id}")
	public Employee employee(@PathVariable("id") Long id) {
		Employee employee = service.getEmployee(id);
		// Get employee by ID
		// Return employee
		return employee;

	}

	@GetMapping(value = "employee/demo")
	public Employee demoEmployee() {
		Employee employee = new Employee();
		employee.setCode("TESTCODE");
		employee.setEmpId(0L);
		employee.setName("Employee Name");
		return employee;
	}

}
