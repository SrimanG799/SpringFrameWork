package com.ciq.service;

import java.util.List;

import com.ciq.model.Employee;

public interface Empservice {

void save(Employee employee);
	
	void update(Employee employee);
	
	Employee getById(Integer id);
	
	List<Employee> findAll();
	
	void delete(Integer id);
}
