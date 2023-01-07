package com.ciq.dao;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ciq.model.Employee;
@Repository
@Transactional
public class DaoImpliEmployee implements EmpDao {
	@Autowired
private HibernateTemplate hibernateTemplate;
	
	public void save(Employee employee) {
		// TODO Auto-generated method stub
		
		hibernateTemplate.save(employee);
		
	}

	public void update(Employee employee) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(employee);
		
	}

	public Employee getById(Integer id) {
		// TODO Auto-generated method stub
		
		
		return (Employee) hibernateTemplate.get(Employee.class, id);
	}

	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return hibernateTemplate.loadAll(Employee.class);
	}

}
