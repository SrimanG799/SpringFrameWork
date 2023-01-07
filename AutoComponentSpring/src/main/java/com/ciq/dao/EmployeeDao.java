package com.ciq.dao;

import java.util.List;

import com.ciq.bean.Employee;

public interface EmployeeDao {

	void save(Employee employee);
	
	void update(Employee employee);
	
	void getById(int id);
	
	public List<Employee> getAll();
	
	

}
