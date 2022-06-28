package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	public Employee addEmployee(Employee employee) {
		employeeRepository.save(employee);
		// add and save and return
		return employee;
	}

	public Employee getEmployee(Long id) {
		// get by Id and return to service

		Employee employee = employeeRepository.findById(id).get();
		return employee;
	}

}
