package com.ciq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.ciq.bean.Employee;
import com.ciq.service.EmployeeService;
import com.ciq.service.EmployeeServiceImpli;
//@Component("empController")

@Controller("empController") 
//it is used for controller 

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
	
	public void update(Employee employee) {
		employeeService.update(employee);
		
	}
	
	public void getById(int id) {
		employeeService.getById(id);
		
	}

}
