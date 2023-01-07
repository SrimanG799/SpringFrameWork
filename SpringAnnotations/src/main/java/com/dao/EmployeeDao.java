package com.dao;

import java.util.List;

import com.spring.bean.Employee;

public interface EmployeeDao {

	void save(Employee employee);
	
	public List<Employee> getAll();
	
	
	public void update(Employee employee);

}
