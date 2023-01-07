package com.ciq.service;

import java.util.List;

import com.ciq.bean.Employee;

public interface EmployeeService {

	void save(Employee employee);
	
	public List<Employee> getAll();
	
    void update(Employee employee);
    
    void deleteById(Integer id);
	
	Employee getById(int id);
	
	public void multiInsert();


}
