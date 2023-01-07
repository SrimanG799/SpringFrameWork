package com.datSuorse;

import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;

public class DBCP {
	public static void main(String[] args) throws SQLException {
		
		BasicDataSource bds=new BasicDataSource();
		bds.setUrl("jdbc:mysql://localhost:3306/hibernate");
		bds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		bds.setUsername("root");
		bds.setPassword("sql799");
		System.out.println(bds.getConnection());
		
		
	}

}
