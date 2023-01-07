package com.createiq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpli;
import com.spring.bean.Employee;

public class EmployeeServiceImpli implements EmployeeService {
	
	
@Autowired
private EmployeeDao employeeDao;
	
	
//	@Autowired on dependencies dont required setter 
//	public void setEmpdao(EmployeeDao employeeDao) {
//		this.employeeDao = employeeDao;
//	}



	public void save(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("employee service method called from service");
	        employeeDao.save(employee);
	}



	@Override
	public List<Employee> getAll() {
		
		return employeeDao.getAll();
	}



	@Override
	public void update(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.update(employee);
		
	}

}
