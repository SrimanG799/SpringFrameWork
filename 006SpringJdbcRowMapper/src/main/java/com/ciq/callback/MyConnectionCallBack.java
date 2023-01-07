package com.ciq.callback;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ConnectionCallback;

import com.ciq.bean.Employee;

public class MyConnectionCallBack implements ConnectionCallback<Employee> {
   private Integer eid;
   
   
	public MyConnectionCallBack(Integer eid) {
	super();
	this.eid = eid;
}


	@Override
	public Employee doInConnection(Connection con) throws SQLException, DataAccessException {
		
		
		// TODO Auto-generated method stub
		
		PreparedStatement ps=con.prepareStatement("select * from employee where empid=?");
		ps.setInt(1, eid);
		
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{
			Employee employee=new Employee();
			employee.setEmpid(rs.getInt("empid"));
			employee.setCampany(rs.getString("company"));
			employee.setName(rs.getString("name"));
			employee.setSalary(rs.getDouble("salary"));
			return employee;
		}
		return null;
		
	}

}
