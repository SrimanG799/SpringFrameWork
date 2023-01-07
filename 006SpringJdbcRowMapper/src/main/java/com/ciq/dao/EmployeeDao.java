package com.ciq.dao;

import java.util.List;

import com.ciq.bean.Employee;

public interface EmployeeDao {

	void save(Employee employee);
	
	void update(Employee employee);
	
	void deleteById(Integer id);
	
	Employee getById(Integer id);
	
	public List<Employee> getAll();
	
	
	public void multiInsert();
	
	

}
