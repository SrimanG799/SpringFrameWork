package com.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.createiq.service.EmployeeService;
import com.createiq.service.EmployeeServiceImpli;
import com.spring.bean.Employee;

public class EmployeeController {
public static	Logger loger=LoggerFactory.getLogger(EmployeeController.class);

	private EmployeeService employeeService;
	

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
		
	
	}


	public void save(Employee employee )
	{
	loger.info("befeore method");
		employeeService.save(employee);
		loger.info("employee method worked{}");
	}

}
