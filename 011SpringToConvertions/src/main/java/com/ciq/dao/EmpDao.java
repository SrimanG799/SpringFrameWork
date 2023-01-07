package com.ciq.dao;

import java.util.List;

import com.ciq.model.Employee;

public interface EmpDao {
	
	
	void save(Employee employee);
	
	void update(Employee employee);
	
	Employee getById(Integer id);
	
	List<Employee> findAll();

}
