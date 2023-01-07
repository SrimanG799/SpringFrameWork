package com.ciq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ciq.bean.Employee;
import com.ciq.dao.EmployeeDao;
import com.ciq.dao.EmployeeDaoImpli;

//@Component

@Service 
//it is used for all services

public class EmployeeServiceImpli implements EmployeeService {
	
	
@Autowired
@Qualifier("employeeDaoTempleteImpli")
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



	@Override
	public void getById(Integer id) {
		// TODO Auto-generated method stub
		employeeDao.getById(id);
	}

}
