package com.ciq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.bean.model.Employee;
import com.ciq.dao.DaoImpli;
   @Service 
public class ServiceImpli implements EmpService {
	   @Autowired
DaoImpli daoImpli;
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		daoImpli.save(employee);
	}

	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(Employee employee) {
		// TODO Auto-generated method stub
		
		daoImpli.update(employee);
		
	}

	public Employee getbyId(Integer id) {
		// TODO Auto-generated method stub
		return daoImpli.getbyId(id);
	}

}
