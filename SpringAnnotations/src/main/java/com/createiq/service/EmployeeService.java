package com.createiq.service;

import java.util.List;

import com.spring.bean.Employee;

public interface EmployeeService {

	void save(Employee employee);
	
	public List<Employee> getAll();
	
	public void update(Employee employee);


}
