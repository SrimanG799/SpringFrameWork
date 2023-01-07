package com.ciq.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.bean.Employee;
import com.ciq.controller.EmployeeController;
import com.ciq.dao.EmployeeDaoImpli;

public class TestWithPropertxml {
	public static void main(String[] args) {
		
	
	
	ApplicationContext apc=new ClassPathXmlApplicationContext("springprop.xml");
	
	EmployeeController controller=(EmployeeController) apc.getBean("empController");
	
	Employee employee=new Employee(23, "ArolTech", "prasanna", 77000);
	
	
//	controller.save(employee);
	
	//controller.update(employee);
	//controller.getById(23);
//	List<Employee> e=controller.getAll();
	//System.out.println(controller.getAll());

	
}
}