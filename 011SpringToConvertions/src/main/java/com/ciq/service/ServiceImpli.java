package com.ciq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.dao.DaoImpliEmployee;
import com.ciq.model.Employee;

@Service
public class ServiceImpli implements Empservice {
	
	@Autowired
    DaoImpliEmployee daoImpliEmployee;
	
	
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		daoImpliEmployee.save(employee);
		
	}

	public void update(Employee employee) {
		// TODO Auto-generated method stub
		daoImpliEmployee.update(employee);
	}

	public Employee getById(Integer id) {
		// TODO Auto-generated method stub
		return daoImpliEmployee.getById(id);
	}

	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return daoImpliEmployee.findAll();
	}

}
