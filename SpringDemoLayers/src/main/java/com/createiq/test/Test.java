package com.createiq.test;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.controller.EmployeeController;
import com.spring.bean.Employee;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		EmployeeController employeeController=(EmployeeController)ac.getBean("empCntr");
		

		Employee employee=new Employee(45, "rajesh", "java", 65000);
		employeeController.save(employee); 
		
	
	}

}
