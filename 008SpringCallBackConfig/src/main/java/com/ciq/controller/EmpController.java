package com.ciq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ciq.bean.model.Employee;
import com.ciq.service.ServiceImpli;

@Controller("emp")
public class EmpController {
	@Autowired
	ServiceImpli serviceImpli;

	public void save(Employee employee) {
		serviceImpli.save(employee);
	}
	public void update(Employee employee) {
		serviceImpli.update(employee);
	}
public Employee getbyId(Integer id) {
	return serviceImpli.getbyId(id);
}
}
