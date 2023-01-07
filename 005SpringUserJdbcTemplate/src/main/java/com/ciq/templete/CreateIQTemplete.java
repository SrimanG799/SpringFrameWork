package com.ciq.templete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ciq.bean.Employee;

public class CreateIQTemplete {
	
	

     DataSource datasourse;

	
	
	public void setDatasourse(DataSource datasourse) {
	this.datasourse = datasourse;
}



	public void update(String sqlQuery,Object[] args)
	{
		Connection connection=null;
		PreparedStatement pst=null;
		
		
		try{
		connection =datasourse.getConnection();
		
		pst=connection.prepareStatement(sqlQuery);
		for (int i = 0; i < args.length; i++) {
			pst.setObject(i+1, args[i]);
		}
		pst.executeUpdate();
		System.out.println("sucess...");
}
		
		catch (Exception e) {
			e.getStackTrace();
			}
		
		finally {
			
			try {
				pst.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}




	
	
}
