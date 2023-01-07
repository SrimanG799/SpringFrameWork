package com.ciq.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ciq.bean.model.Employee;
import com.ciq.callback.MyConnectionCallBack;

@Repository
public class DaoImpli implements EmpDao {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public void save(Employee employee) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("insert into employee values(?,?,?,?)",new Object[] {employee.getEmpid(),employee.getCampany(),employee.getName(),employee.getSalary()});
		
	}

	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(Employee employee) {
		// TODO Auto-generated method stub
		
		jdbcTemplate.update("update employee set company=?,name=?,salary=? where empid=?",new Object[] {employee.getCampany(),employee.getName(),employee.getSalary(),employee.getEmpid()});
		
	}

	public Employee getbyId(Integer id) {
		return jdbcTemplate.execute(new MyConnectionCallBack(id));
		
		
	}

}
