package com.createiq.service;

import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpli;
import com.spring.bean.Employee;

public class EmployeeServiceImpli implements EmployeeService {

	private EmployeeDao employeeDao;
	
	
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}



	public void save(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("employee service method called");
	        employeeDao.save(employee);
	}

}
