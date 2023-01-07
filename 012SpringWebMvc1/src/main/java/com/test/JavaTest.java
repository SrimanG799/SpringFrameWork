package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javaCont.JavaController;
import com.model.Student;

public class JavaTest {
	public static void main(String[] args) {
		ApplicationContext apc=new ClassPathXmlApplicationContext("Springx.xml");
		JavaController jc=(JavaController) apc.getBean("javaC");
		//Student st=new Student(3, "ramya", "VGCE", "MCA");
		//jc.insert(st);
		System.out.println(jc.getAll());
	}

}
