package com.controller;

import java.util.List;

import com.createiq.service.EmployeeService;
import com.createiq.service.EmployeeServiceImpli;
import com.spring.bean.Employee;

public class EmployeeController {
	
	private EmployeeService employeeService;
	
	
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}


	public void save(Employee employee )
	{
		System.out.println("Employee Servoce save called");
		employeeService.save(employee);
	}
	
	public List<Employee> getAll()
	{
		return employeeService.getAll();
		
	}

}
