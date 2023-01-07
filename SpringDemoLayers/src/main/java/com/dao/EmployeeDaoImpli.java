package com.dao;

import com.spring.bean.Employee;

public class EmployeeDaoImpli implements EmployeeDao {

	@Override
	public void save(Employee employee) {
		System.out.println("dao save method called");
		
	}

}
