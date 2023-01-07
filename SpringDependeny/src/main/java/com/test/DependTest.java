package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Address;
import com.spring.model.Employee;
import com.spring.model.Student;

public class DependTest {
	public static void main(String[] args) {
		ApplicationContext apc=new ClassPathXmlApplicationContext("spring.xml");
		
		
		Address ad=(Address) apc.getBean("adr");
		System.out.println(ad);
		Employee empc=(Employee) apc.getBean("emp");
		System.out.println(empc);
		
		Student student=(Student) apc.getBean("stud");
		System.out.println(student);
		
	}

}
