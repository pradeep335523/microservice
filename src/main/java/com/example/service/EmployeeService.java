package com.example.service;

import com.example.entity.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee employee);

	public Employee getEmployee(Long id);

}
