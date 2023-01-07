package com.ciq.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ciq.bean.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Employee employee=new Employee();
	
		employee.setEmpid(rs.getInt("empid"));
		employee.setCampany(rs.getString("company"));
		employee.setName(rs.getNString("name"));
		employee.setSalary(rs.getDouble("salary"));
		
		return employee;
	}

}
