package com.ciq.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ciq.bean.Employee;
import com.ciq.templete.CreateIQTemplete;

@Repository

public class EmployeeDaoTempleteImpli implements EmployeeDao {
	
	@Autowired
	private CreateIQTemplete createIQTemplete;

	@Override
	public void save(Employee employee) {
		
		// TODO Auto-generated method stub
		createIQTemplete.update("insert into Employee values(?,?,?,?)",
				new Object[] {employee.getEmpid(),employee.getCampany(),employee.getName(),employee.getSalary()} );
	}

	@Override
	public void update(Employee employee) {
		
		// TODO Auto-generated method stub
		createIQTemplete.update("update employee set company=?,name=?,salary=? where empid=?",
				new Object[] {employee.getCampany(),employee.getName(),employee.getSalary(),employee.getEmpid()} );
		
		
		
	}

	@Override
	public void getById(Integer id) {
		// TODO Auto-generated method stub
	createIQTemplete.update("select *from employee where empid=?", new Object[] {id});
		
		
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
