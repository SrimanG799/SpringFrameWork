package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.createiq.service.EmployeeService;
import com.createiq.service.EmployeeServiceImpli;
import com.spring.bean.Employee;

public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	
	
//@Autowired on dependencies dont required setter 	
//	public void setServimp(EmployeeService employeeService) {
//		this.employeeService = employeeService;
//	}


	public void save(Employee employee )
	{
		System.out.println("Employee Service save called from controller");
		employeeService.save(employee);
	}
	
	public List<Employee> getAll()
	{
		return employeeService.getAll();
		
	}

}
