package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.Employee;


public class EmployeeDaoImpli implements EmployeeDao {
	
@Autowired
 DataSource datasourse;
	
//@Autowired on dependencies dont required setter 
//	public void setDatasid(DataSource datasourse) {
//		this.datasourse = datasourse;
//	}


	@Override
	public void save(Employee employee) {
		Connection connection=null;
		Statement statement=null;
		PreparedStatement pst=null;
		
		
		try {
		connection = datasourse.getConnection();
		pst=connection.prepareStatement("insert into employee values(?,?,?,?)");
		pst.setInt(1, employee.getEmpid());
		pst.setString(2, employee.getCampany());
		pst.setString(3, employee.getName());
		pst.setDouble(4, employee.getSalary());
		pst.executeUpdate();
		System.out.println("aindhi");
		
		
		
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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


	@Override
	public List<Employee> getAll() {
		Connection connection=null;
		PreparedStatement Ps=null;
		ResultSet resultset=null;
		List<Employee> empl=new ArrayList();
		try {
			connection =datasourse.getConnection();
			Ps=connection.prepareStatement("select *from employee");
			resultset=Ps.executeQuery();
			while(resultset.next())
			{
				Employee emp=new Employee();
				emp.setEmpid(resultset.getInt("empid"));
				emp.setCampany(resultset.getString("company"));
				emp.setName(resultset.getString("name"));
				emp.setSalary(resultset.getDouble("salary"));
				empl.add(emp);
				
			}
		
			
			
			
		}
		
		catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			try {
				resultset.close();
				Ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return empl;
		
		
	}
//	
//	public static void main(String[] args) {
//		ApplicationContext ap=new ClassPathXmlApplicationContext("spring.xml");
////		BasicDataSource edi=	(BasicDataSource) ap.getBean("datasourse");
//	     EmployeeDaoImpli edoi=(EmployeeDaoImpli) ap.getBean("empdao");
//	     Employee employee=new Employee(18, "maheshtech", "mahesh", 150000);
//		edoi.save(employee);
//	}


	@Override
	public void update(Employee employee) {
		
		Connection con=null;
		PreparedStatement pst=null;
		// TODO Auto-generated method stub
		
		try {
			con=datasourse.getConnection();
			pst=con.prepareStatement("update employee set company=?,name=?,salary=? where empid=?");
			
			pst.setString(1, employee.getCampany());
			pst.setString(2, employee.getName());
			pst.setDouble(3, employee.getSalary());
			pst.setInt(4, employee.getEmpid());
			pst.executeQuery();
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try {
				pst.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
