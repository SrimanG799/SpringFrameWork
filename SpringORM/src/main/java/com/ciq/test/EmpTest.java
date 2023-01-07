package com.ciq.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.controller.EmpController;
import com.ciq.model.Employee;

public class EmpTest {
	public static void main(String[] args) {
		ApplicationContext apc=new ClassPathXmlApplicationContext("springOrm.xml");
		
		EmpController empController=(EmpController) apc.getBean("empcntr");
	//Employee employee=new Employee(4, "sriman","devops", "CIQsoft", 65000);
	//empController.save(employee);
		//empController.delete(2);
		System.out.println(empController.findAll());
	
	//System.out.println(empController.getById(4));
		
	}

}
