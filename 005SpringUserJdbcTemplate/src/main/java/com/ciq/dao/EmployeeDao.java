package com.ciq.dao;

import java.util.List;

import com.ciq.bean.Employee;

public interface EmployeeDao {

	void save(Employee employee);
	
	void update(Employee employee);
	
	void getById(Integer id);
	
	public List<Employee> getAll();
	
	

}
