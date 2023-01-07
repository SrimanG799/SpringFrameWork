package com.test;


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.controller.EmployeeController;
import com.spring.bean.Employee;

public class TestDb {
	public static void main(String[] args) {
		ApplicationContext apc=new ClassPathXmlApplicationContext("spring.xml");
		EmployeeController controller=(EmployeeController) apc.getBean("cntr");
//		
//		Employee employee=new Employee(20, "izentsoft", "prasadh", 77000);
//		controller.save(employee);
//		
		
		List<Employee> remp=controller.getAll();
		System.out.println(remp);
			
	}

}
