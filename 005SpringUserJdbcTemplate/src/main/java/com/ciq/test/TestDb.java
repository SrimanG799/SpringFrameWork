package com.ciq.test;


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.bean.Employee;
import com.ciq.controller.EmployeeController;
//test with spring xml
public class TestDb {
	public static void main(String[] args) {
		ApplicationContext apc=new ClassPathXmlApplicationContext("spring.xml");
		
		EmployeeController controller=(EmployeeController) apc.getBean("empController");
		
//		Employee employee=new Employee(22, "izentsoft", "prasadh", 77000);
//		controller.save(employee);
		
//		
		//List<Employee> remp=controller.getAll();
		//System.out.println(remp);
		//controller.getAll();
		controller.getById(21);
		
//			
	}

}
