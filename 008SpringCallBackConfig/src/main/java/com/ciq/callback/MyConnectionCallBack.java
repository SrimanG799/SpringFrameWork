package com.ciq.callback;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ConnectionCallback;

import com.ciq.bean.model.Employee;

public class MyConnectionCallBack implements ConnectionCallback<Employee> {
	
	private Integer id;
	

	public MyConnectionCallBack(Integer id) {
		super();
		this.id = id;
	}


	public Employee doInConnection(Connection con) throws SQLException, DataAccessException {
		
		PreparedStatement ps=con.prepareStatement("select * from employee where empid=?");
		ps.setInt(1, id);
		ResultSet rs=ps.executeQuery();
		Employee emp=new Employee();
		if(rs.next())
		{
			
			emp.setEmpid(rs.getInt("empid"));
			emp.setCampany(rs.getString("company"));
			emp.setName(rs.getString("name"));
			emp.setSalary(rs.getDouble("salary"));
			
		}
		return emp;
		
		
	
		
	}

}
