package com.ciq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.bean.Employee;
import com.ciq.dao.EmployeeDao;
@Service
public class TempleteService implements EmployeeService{
	
	@Autowired
  EmployeeDao empdao;
	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		empdao.save(employee);
		
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return empdao.getAll();
	}

	@Override
	public void update(Employee employee) {
		// TODO Auto-generated method stub
		empdao.update(employee);
		
	}

	@Override
	public Employee getById(int id) {
		// TODO Auto-generated method stub
		return empdao.getById(id);
		
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
		empdao.deleteById(id);
		
	}

	@Override
	public void multiInsert() {
		// TODO Auto-generated method stub
		empdao.multiInsert();
	}

}
