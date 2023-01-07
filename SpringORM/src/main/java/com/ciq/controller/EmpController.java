package com.ciq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ciq.model.Employee;
import com.ciq.service.ServiceImpli;
@Controller("empcntr")
public class EmpController {
@Autowired	
ServiceImpli serviceImpli;

public void save(Employee employee) {
	serviceImpli.save(employee);
	
}
	
	public void update(Employee employee) {
		serviceImpli.update(employee);
		
	}
	
public 	Employee getById(Integer id) {
		return serviceImpli.getById(id);
		
	}
	
	public List<Employee> findAll(){
		return serviceImpli.findAll();
		
	}
	public void delete(Integer id)
	{
		serviceImpli.delete(id);
	}
}
