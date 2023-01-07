package com.ciq.service;

import java.util.List;

import com.ciq.bean.model.Employee;

public interface EmpService {
	
void save(Employee employee);
	
	List<Employee> getAll();
	void update(Employee employee);
	Employee getbyId(Integer id);

}
