package com.ciq.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ciq.bean.model.Employee;
import com.ciq.config.SpringConfig;
import com.ciq.controller.EmpController;

public class EmployeeTest {
public static void main(String[] args) {
	ApplicationContext ac=new AnnotationConfigApplicationContext(SpringConfig.class);
	         EmpController Contr=(EmpController) ac.getBean("emp");
	       //  Employee em=new Employee(15, "manjalitecq", "madesh", 45000);
	         
	       //  Contr.update(em);
	       System.out.println( Contr.getbyId(15));
}
}
