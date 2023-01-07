package com.ciq.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.bean.Employee;
import com.ciq.controller.EmployeeController;

public class JdbcTempTest {
	public static void main(String[] args) {
		ApplicationContext apc=new ClassPathXmlApplicationContext("spring.xml");
	EmployeeController employee=(EmployeeController) apc.getBean("empController");
	//Employee emp=new Employee(35, "shranSofetch", "shan", 80000);
	//employee.save(emp);
	//employee.update(emp);
	
//	Employee e=employee.getById(13);
//	System.out.println(e);
	employee.multiInsert();
	
	
	System.out.println(employee.getAll());
	}

}