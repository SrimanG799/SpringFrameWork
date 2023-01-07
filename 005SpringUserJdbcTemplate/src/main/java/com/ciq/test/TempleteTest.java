package com.ciq.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.bean.Employee;
import com.ciq.controller.EmployeeController;

public class TempleteTest {
	public static void main(String[] args) {
		ApplicationContext apc=new ClassPathXmlApplicationContext("spring.xml");
		EmployeeController employeeController=(EmployeeController) apc.getBean("empController");
		
		//Employee emp=new Employee(26, "tuzensol", "manjula", 65214);
		//employeeController.save(emp);
	 // Employee st=employeeController.getById(2);
	}

}
