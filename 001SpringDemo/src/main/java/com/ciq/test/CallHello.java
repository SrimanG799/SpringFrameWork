package com.ciq.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.bean.Employee;
import com.ciq.bean.HelloWorldBean;
import com.ciq.bean.Student;

public class CallHello {
	public static void main(String[] args) {
		
		  ApplicationContext apc=new ClassPathXmlApplicationContext("spring.xml");
		 //HelloWorldBean hw=new HelloWorldBean();
	       //HelloWorldBean hw=(HelloWorldBean) apc.getBean("hello");
	      // hw.myword("sriman");
	      //System.out.println(hw.getName());
	     // hw.myword();
		  
		  
		  
	    Employee employee=(Employee) apc.getBean("emp");
	    System.out.println(employee);
	    Employee employee2=(Employee) apc.getBean("emp2");
	    System.out.println(employee2);
	    
	    
		  
		  Student student=(Student) apc.getBean("stu");
		  System.out.println(student);
		  Student student2=(Student) apc.getBean("stu2");
		  System.out.println(student2);
		  
	}

}
