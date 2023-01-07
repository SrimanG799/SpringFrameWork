package com.datSuorse;

import java.sql.SQLException;

import com.zaxxer.hikari.HikariDataSource;

public class HikariDBP {
	public static void main(String[] args) throws SQLException {
		
	
	HikariDataSource hdk=new HikariDataSource();
	hdk.setJdbcUrl("jdbc:mysql://localhost:3306/hibernate");
	hdk.setDriverClassName("com.mysql.cj.jdbc.Driver");
	hdk.setUsername("root");
	hdk.setPassword("sql799");
	System.out.println(hdk.getConnection());

}
}
